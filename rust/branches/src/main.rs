fn main() {
    let example_1 = 7;

    if example_1 < 5 {
        println!("condition was true")
    } else {
        println!("condition was false")
    }

    /* --- */

    let example_2 = 3;

    // Rust will not automatically convert non-bool types to bool
    // if example_2 {
    //     println!("this is invalid")
    // }

    if example_2 != 0 {
        println!("number was something other than zero")
    }

    /* --- */

    let example_3 = 6;

    if example_3 % 4 == 0 {
        println!("number is divisible by 4");
    } else if example_3 % 3 == 0 {
        println!("number is divisible by 3");
    } else if example_3 % 2 == 0 {
        println!("number is divisible by 2")
    } else {
        println!("number is not divisible by 2, 3, or 4")
    }

    /* --- */

    // Because if is an expression, a let statement can be used to assign the result to a variable
    let condition = true;
    let number = if condition { 5 } else { 6 };

    // Types cant be mismatched
    // let number = if condition { 5 } else { "six" };

    println!("the value of number is: {number}");
}
