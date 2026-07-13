fn main() {
    // Integer types
    let e_bit: i8 = 1;
    let s_bit: i16 = 320;
    let tt_bit: i32 = 9819230; // Default
    let sf_bit: i64 = 9819230123456789;
    let hte_bit: i128 = 9819230123456789123456789;
    let arch_bit: isize = 100; // Normally used for indexing some sort of collection

    // Integer literals
    let decimal = 98_222;
    let hex = 0xff;
    let oct = 0o77;
    let bin = 0b1111_0000;
    let byte = b'A'; // u8 only

    // In debug, overflows will cause panic; in release, they will wrap. This is considered an error. To handle:
    // Use from the standard library:
    // - wrapping_*
    // - checked_*
    // - overflowing_*
    // - saturating_*

    //

    // Floating point types
    let fp_1 = 2.0; // Defaults to f64;
    let fp_2: f32 = 3.0;

    // Numeric Operations
    // Addition
    let sum = 5 + 10;

    // Subtraction
    let difference = 95.5 - 4.3;

    // Multiplication
    let product = 4 * 30;

    // Division
    let quotient = 56.7 / 32.2;
    let truncated = -5 / 3; // Results in -1

    // Remainder
    let remainder = 43 % 5;

    //

    // Boolean types
    let t = true;

    let f: bool = false; // With explicit type annotation

    //

    // Character types
    let c = 'z';
    let z: char = 'Z'; // With explicit type annotation
}
