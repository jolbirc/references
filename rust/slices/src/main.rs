fn main() {
    let mut s = String::from("hello world");

    let _word = first_word(&s); // word will get the value 5

    s.clear(); // Empties string, making it ""

    // `word` stil has value 5 here, but s no longer has any meaningful value

    // Slicing
    let t = String::from("hello world");
    let hello = &t[0..5];
    // let hello = &s[..5];  Also valid if starting from index 0
    let world = &t[6..11];
    // let world = &s[6..];  Also valid if ending at end of string

    // String slices must occur at valid UTF-8 char boundaries

    let word = first_word_slice(&t);
    println!("{word}");

    let my_string = String::from("The cat sat on the mat");

    let word = first_word_slice_improved(&my_string[0..2]);
    println!("{word}");

    // Also works with arrays
    let a = [1, 2, 3, 4, 5];

    let slice = &a[1..3];

    assert_eq!(slice, &[2, 3]);
}

// Returns a byte index value into the String parameter
fn first_word(s: &String) -> usize {
    // To check whether value is a spaec, convert to array of bytes
    let bytes = s.as_bytes();

    // Iterate over bytes: enumerate wraps the iter and returns a tuple of index + reference to value - saves calculating index manually
    // i = index, item = byte in tuple
    for (i, &item) in bytes.iter().enumerate() {
        // byte literal
        if item == b' ' {
            // if space found, return index
            return i;
        }
    }

    // else return length of string
    s.len()
}

// Same using slices
fn first_word_slice(s: &String) -> &str {
    let bytes = s.as_bytes();

    // Look for first space, return string slice using start of string and index of space
    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[0..i];
        }
    }

    &s[..]
}

// Improved signature allowing use on both &String values and &str values
fn first_word_slice_improved(s: &str) -> &str {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[0..i];
        }
    }

    &s[..]
}

// In above, if we have a string slice, it can be passed directly. If we have a String, a slice of it can be passed.
