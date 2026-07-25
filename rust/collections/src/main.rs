fn main() {
    /* === VECTORS === */
    // Vector of 32bit integers
    let mut v: Vec<i32> = Vec::new();

    // Type infered with macro
    let v2 = vec![1, 2, 3];

    // Updating a vector
    v.push(5);
    v.push(6);
    v.push(7);
    v.push(8);

    /* READING VALUES */
    // Using index
    let third: &i32 = &v[2];
    println!("The third element is {third}");

    // Using get
    let third: Option<&i32> = v.get(2);
    match third {
        Some(third) => println!("The third element is {third}"),
        None => println!("There is not third element."),
    }

    /* NON-EXISTENT ELEMENTS */
    // WILL panic
    // let does_not_exist = &v[100];

    // WONT panic - get method returns None if non-existent
    let does_not_exist = v.get(100);

    /* ITERATION */
    // Iterating over values in a vector (immutable references to each element)
    let v3 = vec![100, 32, 57];
    for i in &v3 {
        println!("{i}");
    }

    // Mutable vector and making changes
    let mut v4 = vec![200, 500, 60];
    for i in &mut v4 {
        *i += 50;
    }

    /* VECTORS WITH ENUMS */
    // Defining an enum to store values of differing types in one vector
    enum SpreadsheetCell {
        Int(i32),
        Float(f64),
        Text(String),
    }

    let row = vec![
        SpreadsheetCell::Int(3),
        SpreadsheetCell::Text(String::from("blue")),
        SpreadsheetCell::Float(10.12),
    ];

    // -------------------------------------------------------------------------

    /* === STRINGS === */
}
