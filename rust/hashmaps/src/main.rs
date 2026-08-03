use std::collections::HashMap;

fn main() {
    let mut scores = HashMap::new();

    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);

    // Accessing the value stored in the hash map
    let team_name = String::from("Blue");
    let score = scores.get(&team_name).copied().unwrap_or(0);

    // Iterating
    for (key, value) in &scores {
        println!("{key}: {value}");
    }

    // Showing that keys and values are owned by the hash map once they're inserted
    let field_name = String::from("Favourite colour");
    let field_value = String::from("Blue");

    let mut map = HashMap::new();
    map.insert(field_name, field_value);

    // Replacing a value stored with a particular key
    let mut scores_two = HashMap::new();

    scores_two.insert(String::from("Blue"), 10);
    scores_two.insert(String::from("Blue"), 25);

    println!("{scores:?}");

    // Using the entry method to only insert if the key does not already hold a value
    scores.entry(String::from("Yellow")).or_insert(50);
    scores.entry(String::from("Blue")).or_insert(50);

    println!("{scores:?}");

    // Counting the occurences of words using a hashmap that stores words and counts
    let text = "hello world wonderful world";

    let mut map = HashMap::new();

    for word in text.split_whitespace() {
        let count = map.entry(word).or_insert(0);
        *count += 1;
    }

    println!("{map:?}");
}
