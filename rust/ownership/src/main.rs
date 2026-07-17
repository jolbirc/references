fn main() {
    let x = true;
    read(x);

    let a_num = 4;
    make_and_drop();

    // If a variable owns a box, when Rust deallocates the variable's frame, it deallocates the box's heap memory
    let a = Box::new([0; 1_000_000]);
    let b = a;

    // Collections use boxes
    let first = String::from("Ferris");
    let full = add_suffix(first);
    println!("{full}");

    // Invalid (variables cannot be used after being moved)
    // println!("{full}, originally {first}");

    // Using clone
    let word = String::from("Hello");
    let word_clone = word.clone();
    let full = add_exclamation(word_clone);
    println!("{full}")
}

fn read(y: bool) {
    if y {
        println!("y is true!")
    }
}

fn make_and_drop() {
    let a_box = Box::new(5);
}

fn add_suffix(mut name: String) -> String {
    name.push_str("Jr.");
    name
}

fn add_exclamation(mut name: String) -> String {
    name.push_str("!");
    name
}
