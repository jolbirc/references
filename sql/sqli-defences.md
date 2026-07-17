# SQL Injection: Remediation Guide

Ranked roughly by effectiveness.

## 1. Prepared Statements (Parameterised Queries) - *the* fix

Separates SQL code from data. The query structure is fixed by the developer; user input is sent to the database separately and is never interpreted as executable SQL.

**Vulnerable (PHP):**
```php
$query = "SELECT * FROM users WHERE username='" . $_POST['username'] . "'";
$result = mysqli_query($conn, $query);
```

**Fixed (PDO):**
```php
$stmt = $pdo->prepare("SELECT * FROM users WHERE username = ?");
$stmt->execute([$_POST['username']]);
$result = $stmt->fetchAll();
```

**Vulnerable (Python):**
```python
query = f"SELECT * FROM users WHERE username='{username}'"
cursor.execute(query)
```

**Fixed (Python):**
```python
cursor.execute("SELECT * FROM users WHERE username = %s", (username,))
```

Even input like `' OR 1=1--` is treated as a literal string, not query syntax. Every major language/framework supports this - use it by default.

## 2. Input Validation

Controls what the app accepts before it reaches the database. Prefer **allowlisting** (define what's valid, reject the rest) over blocklisting (trying to filter bad characters brittle and bypassable via encoding/alternate syntax).

```php
if (!ctype_digit($_GET['id'])) {
    die("Invalid input");
}
```

A supplement to prepared statements, not a replacement.

## 3. Escaping User Input

Escapes special characters (e.g. `'` → `\'`) so they're treated as literals. Fragile and database-specific - rules differ per engine. Use only as a last resort, e.g. legacy code that can't yet be refactored to use prepared statements.

## 4. Principle of Least Privilege

Defence-in-depth: limit what a compromised DB account can do.

- Read-only app → `SELECT`-only account, nothing else
- Never connect as `root` / `sa` from the application
- Restrict access to sensitive tables to only the procedures that need them

If SQLi is exploited through a low-privilege account, the attacker can't drop tables, access other databases, or run system commands.

## 5. Web Application Firewalls (WAFs)

Blocks known attack patterns (`' OR 1=1`, `UNION SELECT`, `information_schema`, etc.) at the request level. Useful as an extra layer, but experienced attackers bypass WAFs with encoding tricks and obfuscation. Not a substitute for secure code.
