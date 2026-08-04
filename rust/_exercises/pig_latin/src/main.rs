fn main() {
    let word = "hello";
    let result = pig_latin(word);
    println!("{result}");
}

fn pig_latin(word: &str) -> String {
    let mut chars = word.chars();
    let first = chars.next().unwrap();
    let rest = chars.collect::<String>();
    format!("{rest}{first}ay")
}
