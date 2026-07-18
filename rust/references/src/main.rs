fn main() {
    let s1 = String::from("hello");
    let mut s2 = String::from("goodbye");

    // Cannot have multiple mutable references to the same value
    let _r1 = &mut s2;
    // let r2 = &mut s2;

    // Can use curly braces to create new scope allowing for multiple mutable references (just not simultaneous)
    {
        let _r2 = &mut s2;
    } // r2 goes out of scope here

    // Immutable references are fine:
    let r3 = &s1; // Fine
    let r4 = &s1; // Fine
    // let r5 = &mut s1; // Not fine

    let len = calculate_length(&s2);
    change(&mut s2);

    println!("The length of '{s1}' is {len}.");
    // println!("{r1}, {r2}");
    // println!("{r3}, {r4} and {r5}");

    // Scope
    let mut s3 = String::from("mutable");

    let r6 = &s3;
    let r7 = &s3;
    println!("{r6} and {r7}");
    // Variables r1 and r2 will not be used after this point

    let r8 = &mut s3; // Fine
    println!("{r8}");

    // Dangling references:
    let reference_to_nothing = dangle();
}

// Reference to an object as a parameter instead of taking ownership
fn calculate_length(s: &String) -> usize {
    s.len()
}

// Won't work
// fn change(some_string: &String) {
//     some_string.push_str(", world");
// }

// Mutable reference
fn change(some_string: &mut String) {
    some_string.push_str(", world");
}

// Dangling:
// Returns reference to a string
fn dangle() -> &String {
    // New string
    let s = String::from("hello");
    // Return reference to string
    &s
} // .. but goes out of scope here

fn no_dangle() -> String {
    let s = String::from("Hello");
    s
}
