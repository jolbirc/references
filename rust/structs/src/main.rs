// A struct definition
struct User {
    active: bool,
    username: String,
    email: String,
    sign_in_count: u64,
}

// Tuple struct
struct Colour(i32, i32, i32);
struct Point(i32, i32, i32);

// Unit struct; no data
struct AlwaysEqual;

fn main() {
    // Creating an instance of a struct
    let user1 = User {
        active: true,
        username: String::from("someusername123"),
        email: String::from("someone@example.com"),
        sign_in_count: 1,
    };

    // Changing the value of a field
    let mut user2 = User {
        active: true,
        username: String::from("anotheruser321"),
        email: String::from("another@example.com"),
        sign_in_count: 99,
    };

    user2.email = String::from("yetanother@example.com");

    // Creating instances using struct update syntax to use values from another instance
    // NOTE: If copying using types that DON'T implement the `Copy` trait (i.e String),
    // original instance can no longer be used!
    let user3 = User {
        email: String::from("onlyhasadifferentemail@example.com"),
        ..user1
    };

    // Value that hasn't been changed via struct update can still be used
    let still_usable_variable = user1.email;
    println!("{still_usable_variable}");

    // Tuple structs
    let black = Colour(0, 0, 0);
    let origin = Point(0, 0, 0);

    // Unit struct
    let subject = AlwaysEqual;
}

// A function that returns a struct instance
fn build_user(email: String, username: String) -> User {
    User {
        active: true,
        username: username,
        email: email,
        sign_in_count: 1,
    }
}

// Field Init shorthand
fn build_user_shorter(email: String, username: String) -> User {
    User {
        active: true,
        username,
        email,
        sign_in_count: 1,
    }
}
