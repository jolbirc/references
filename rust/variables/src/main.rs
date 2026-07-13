fn main() {
    let x = 5;
    println!("The value of x is: {x}");
    let x = 6;
    println!("The value of x is: {x}");

    //

    let y = 5;

    let y = y + 1;

    {
        let y = y * 2;
        println!("The value of y in inner scope is: {y}");
    }

    println!("The value of y is {y}");

    //

    // Valid
    let spaces = "   ";
    let spaces = spaces.len();

    println!("{spaces}");

    // Invalid
    let mut spaces_invalid = "   ";
    spaces_invalid = spaces_invalid.len();

    println!("{spaces_invalid}")
}
