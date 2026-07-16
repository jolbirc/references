fn main() {
    //
    /* VARIABLE SCOPE */
    //

    let _a = "Hello";

    {
        // 'b' is valid from this point forward
        let _b = "Hello";

        // Do stuff with 't'
    }
    // ^ This scope is now over

    // This kind of String (namespaced) is MUTABLE
    let mut c = String::from("Hello");
    c.push_str(", world!");
    println!("{c}");

    {
        let _d = String::from("Hello");
    }
    // ^ Again this scope is now ever and the memory is automatically freed
    // Rust calls `drop` automatically at a closing brace

    //
    /* INTEGER EXAMPLE */
    //

    let x = 5;
    let _y = x;

    // Doesn't work the same as above: contains pointer, contents, length (mem in b), and capactity
    let s1 = String::from("Hello");
    // String DATA is copied, so both point to the same memory
    let s2 = s1;
    // println!("{s1}, world!");

    // When two variables try to free the same memory, this is a 'double free' error
    // Another example:
    let mut t = String::from("Hello");
    t = String::from("ahoy"); // Immediately dropped; at this point, nothing refers to orginal value
    println!("{t}, world!");

    //
    /* CLONE */
    //

    // For deep copying (heap data gets copied)
    let str = String::from("hello");
    let _strcpy = str.clone();

    println!("str = {str}, strcpy = {s2}\n");

    // Note: types such as integers that have a known size are stored entirely on the stack, and thus example in 'integer'
    // is valid. Simple scalar types can implement the `Copy` trait, which allows them to be copied by value (as well
    // as tuples that only contain types that implement `Copy`)

    //
    /* FUNCTIONS */
    //

    let func_str = String::from("hello"); // func_str comes into scope
    println!("{func_str}");
    takes_ownership(func_str); // value moves into function, so no longer valid here
    // println!("{func_str}"); < Won't compile

    let digit = 5; // comes into scope
    println!("{digit}");
    makes_copy(digit); // Because i32 implements `Copy`, digit does NOT move into function, so can still be used afterward.
    println!("{digit}"); // Will compile

    // Returning values can also transfer ownership
    {
        let a1 = gives_ownership(); // Moves return value into a1
        let a2 = String::from("Hello"); // a2 comes into scope
        let a3 = takes_and_gives_back(a2); // move into, which also moves its return value into a3
    } // a3 goes out of scope and is dropped, a2 was moved, so nothing happens. a1 goes out of scope and is dropped.

    // Returning multiple values using a tuple
    let t1 = String::from("hello");
    let (t2, len) = calculate_length(t1);
    println!("The length of '{s2}' is {len}");
}

fn takes_ownership(some_string: String) {
    // some_string comes into scope
    println!("{some_string}");
} // some_string goes out of scope and 'drop' is called. Memory freed

// Move its return value into function that calls it
fn gives_ownership() -> String {
    let some_string = String::from("yours"); // in scope
    some_string // returned and move out to the calling function
}

fn makes_copy(some_integer: i32) {
    // some_integer comes into scope
    println!("{some_integer}");
} // Here, some_integer goes out of scope. Nothing special happens

// Takes a string and returns a string
fn takes_and_gives_back(a_string: String) -> String {
    a_string // a_string is returned and move out to the calling function
}

fn calculate_length(s: String) -> (String, usize) {
    let length = s.len(); // len() returns the length of a string
    (s, length)
}
