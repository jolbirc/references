fn main() {
    /* RETURNING VALUES FROM 'loop' */
    println!("\n");
    let mut counter = 0;

    let result = loop {
        counter += 1;

        if counter == 10 {
            break counter * 2; // Can break with a value. Can also return from inside a loop
        }
    };

    println!("The result is {result}");

    /* LOOP LABELS */
    println!("\n");
    let mut count = 0;

    'counting_up: loop {
        println!("count = {count}");
        let mut remaining = 10;

        loop {
            println!("remaining = {remaining}");
            if remaining == 9 {
                break;
            }
            if count == 2 {
                break 'counting_up;
            }
            remaining -= 1;
        }

        count += 1;
    }

    println!("End count = {count}");

    /* WHILE IMPLEMENTED USING `loop`, `if`, `else`, AND `break` */
    println!("\n");
    let mut count = 0;

    loop {
        if count < 10 {
            println!("count = {count}");
            count += 1;
        } else {
            break;
        }
    }

    /* WHILE */
    println!("\n");
    let mut number = 3;

    while number != 0 {
        println!("{number}!");
        number -= 1;
    }

    println!("LIFTOFF!");

    println!("\n");

    // Using while to loop over a collection
    let a = [10, 20, 30, 40, 50];
    let mut index = 0;

    while index < 5 {
        println!("the value is {}", a[index]);
        index += 1;
    }

    // More concise, safer, faster approach using `for`
    println!("\n");
    for element in a {
        println!("the value is: {element}");
    }

    // Another for implementation (try to use for over while when possible)
    println!("\n");
    for number in (1..4).rev() {
        println!("{number}!");
    }
    println!("LIFTOFF AGAIN!!");
}
