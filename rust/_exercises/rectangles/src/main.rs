#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

// Methods
impl Rectangle {
    // First parameter is always self
    fn area(&self) -> u32 {
        self.width * self.height
    }

    // Can also give a method same name as one of structs fields
    fn width(&self) -> bool {
        self.width > 0
    }
}

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };

    println!(
        "The area of the rectangle is {} square pixels.",
        rect1.area()
    );

    // Rust recognises the parentheses and picks the method over the field of same name (and vice versa)
    if rect1.width() {
        println!("The rectangle has a nonzero width; it is {}", rect1.width);
    }

    println!("rect1 is {rect1:#?}");

    // dbg! macro
    let scale = 2;
    let rect2 = Rectangle {
        width: dbg!(30 * scale),
        height: 50,
    };

    dbg!(&rect2);
}

// fn area(rectangle: &Rectangle) -> u32 {
//     rectangle.width * rectangle.height
// }
