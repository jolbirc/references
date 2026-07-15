use std::io;

fn main() {
    println!("=== FIBONACCI GENERATOR ===");

    loop {
        println!("Find Fibonacci numbers up to which number? (max 2147483647):");

        let mut max = String::new();

        io::stdin()
            .read_line(&mut max)
            .expect("Failed to read line");

        let max: i32 = match max.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        if max > 2147483646 {
            println!("n must be less than or equal to 2147483647.");
            continue;
        }
        if max < 1 {
            println!("n must be greater than or equal to 1.");
            continue;
        } else {
            fibonacci(max);
        }
    }
}

fn fibonacci(n: i32) {
    if n > 2147483646 {
        println!("n must be less than or equal to 2147483647.");
        return;
    }

    if n < 1 {
        println!("n must be greater than or equal to 1.");
        return;
    }

    let mut fib = 0;
    let mut next = 1;

    while fib <= n {
        println! {"{fib}"};
        let temp = fib;
        fib = next;
        next += temp;
    }
}
