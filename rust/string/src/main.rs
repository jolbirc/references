fn main() {
    let mut s = String::new();
    let data = "initial contents";

    let s = data.to_string();

    // The method also works on a literal directly
    let s = "initial contents".to_string();

    // Equivalent
    let s = String::from("initial contents");

    // Strings are UTF-8 encoded
    let hello_arabic = String::from("السلام عليكم");
    let hello_czech = String::from("Dobrý den");
    let hello_english = String::from("Hello");
    let hello_hebrew = String::from("שלום");
    let hello_nepali = String::from("नमस्ते");
    let hello_japanese = String::from("こんにちは");
    let hello_korean = String::from("안녕하세요");
    let hello_chinese = String::from("你好");
    let hello_portugese = String::from("Olá");
    let hello_russian = String::from("Здравствуйте");
    let hello_spanish = String::from("Hola");

    // Appending a string slice to a String using the push_str method
    let mut s = String::from("foo");
    s.push_str("bar");

    // Using a string slice after appending its contents to a String
    let mut s1 = String::from("foo");
    let s2 = "bar";
    s1.push_str(s2);
    println!("s2 is {s2}");

    // Adding a character to a String value using push
    let mut s = String::from("lo");
    s.push('l');
    println!("{s}");

    // Using the + operator to combine two string values into a new String value
    let s1 = String::from("Hello, ");
    let s2 = String::from("world!");
    let s3 = s1 + &s2; // note s1 has been moved here and can no longer be used
    println!("{s3}");

    // Concatenating using a macro
    let str_1 = String::from("tic");
    let str_2 = String::from("tac");
    let str_3 = String::from("toe");

    let str = format!("{str_1}-{str_2}-{str_3}");
    println!("{str}");

    // Best way to iterate over Strings is to be explicit:
    for c in "Зд".chars() {
        println!("{c}");
    }

    // bytes method returns each raw byte
    for b in "Зд".bytes() {
        println!("{b}");
    }
}
