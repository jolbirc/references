fn main() {
    println!("Hello, world!");
    another_function(5);
    print_labelled_measurement(5, 'h');

    let x = five();
    println!("The value of x is: {x}");

    let y = plus_one(5);
    println!("The value of y is: {y}")
}

/* Functions */

// Type of parameter must be declared
fn another_function(x: i32) {
    println!("The value of x is: {x}.")
}

// Multiple parameters
fn print_labelled_measurement(value: i32, unit_label: char) {
    println!("The measurement is: {value}{unit_label}")
}

// Return type and implicit returns
fn five() -> i32 {
    5
}

fn plus_one(x: i32) -> i32 {
    x + 1
}
