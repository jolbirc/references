use std::io;

fn main() {
    println!("--- TEMPERATURE CONVERTER ---");

    loop {
        println!("Enter the unit you want to convert *from*: ");

        let mut unit = String::new();

        io::stdin()
            .read_line(&mut unit)
            .expect("Failed to read line");

        // Shadow the string into a char
        let unit: char = match unit.trim().parse() {
            Ok(char) => char,
            Err(_) => continue,
        };

        if unit == 'f' || unit == 'F' {
            println!("Enter the temperature in Fahrenheit: ");

            let mut f = String::new();

            io::stdin().read_line(&mut f).expect("Failed to read line");

            // Shadow string into float
            let f: f32 = match f.trim().parse() {
                Ok(f32) => f32,
                Err(_) => continue,
            };

            let f = f_to_c(f);

            println!("The temperature in Celsius is: {}", f);
        } else if unit == 'c' || unit == 'C' {
            println!("Enter the temperature in Celsius: ");

            let mut c = String::new();

            io::stdin().read_line(&mut c).expect("Failed to read line");

            // Shadow string into float
            let c: f32 = match c.trim().parse() {
                Ok(f32) => f32,
                Err(_) => continue,
            };

            let c = c_to_f(c);

            println!("The temperature in Fahrenheit is: {}", c);
        } else {
            continue;
        }
    }
}

fn f_to_c(f: f32) -> f32 {
    (f - 32.0) * 5.0 / 9.0
}

fn c_to_f(c: f32) -> f32 {
    (c * 9.0 / 5.0) + 32.0
}
