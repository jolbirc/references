use std::io;

fn main() {
    /* Integer types */

    let _8_bit: i8 = 1;
    let _16_bit: i16 = 320;
    let _32_bit: i32 = 9819230; // Default
    let _64_bit: i64 = 9819230123456789;
    let _128_bit: i128 = 9819230123456789123456789;
    let _arch_bit: isize = 100; // Normally used for indexing some sort of collection

    // Integer literals
    let _decimal = 98_222;
    let _hex = 0xff;
    let _oct = 0o77;
    let _bin = 0b1111_0000;
    let _byte = b'A'; // u8 only

    // In debug, overflows will cause panic; in release, they will wrap. This is considered an error. To handle:
    // Use from the standard library:
    // - wrapping_*
    // - checked_*
    // - overflowing_*
    // - saturating_*

    /* Floating point types */

    let _fp_1 = 2.0; // Defaults to f64;
    let _fp_2: f32 = 3.0;

    /* Numeric Operations */
    // Addition
    let _sum = 5 + 10;

    // Subtraction
    let _difference = 95.5 - 4.3;

    // Multiplication
    let _product = 4 * 30;

    // Division
    let _quotient = 56.7 / 32.2;
    let _truncated = -5 / 3; // Results in -1

    // Remainder
    let _remainder = 43 % 5;

    /* Boolean types */

    let _t = true;
    let _f: bool = false; // With explicit type annotation

    /* Character types */

    let _c = 'z';
    let _z: char = 'Z'; // With explicit type annotation

    /* Compound types */

    // Tuple
    let tuple: (i32, f64, u8) = (500, 6.4, 1); // Cannot change size (len), items can be different types
    let (x, y, z) = tuple; // Destructuring to turn into variables
    let five_hundred = tuple.0; // Accessing by index
    let six_point_four = tuple.1;
    println!("The value of y is: {y}");

    // Array
    let array_a = [1, 2, 3, 4, 5]; // All items of array must be same type, arrays in rust are FIXED length
    let array_b: [i32; 5] = [1, 2, 3, 4, 5]; // Type and size declaration
    let array_c = [3; 5]; // 5 elements, set to 3
    let first = array_a[0]; // Accessing elements
    let second = array_b[1];

    // Out of bounds test
    println!("Please enter an array index.");

    let mut index = String::new();

    io::stdin()
        .read_line(&mut index)
        .expect("Failed to read line");

    let index: usize = index
        .trim()
        .parse()
        .expect("Index entered was not a number");

    let element = array_a[index];

    println!("The value of element at {index} is: {element}");
}
