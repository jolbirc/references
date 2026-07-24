pub fn add(left: u64, right: u64) -> u64 {
    left + right
}

pub fn eat_at_restaurant() {
    // Absolute path
    crate::front_of_house::hosting::add_to_waitlist();

    // Relative path
    front_of_house::hosting::add_to_waitlist();

    // Order a breakfast in the summer with rye toast
    let mut meal = back_of_house::Breakfast::summer("Rye");
    // Change bread
    meal.toast = String::from("Wheat");
    println!("I'd like {} toast please", meal.toast);
    // meal.seasonal_fruit = String::from("blueberries")
    // ^ won't compile

    let order1 = back_of_house::Appetizer::Soup;
    let order2 = back_of_house::Appetizer::Salad;
}

fn deliver_order() {
    todo!();
}

mod front_of_house {
    // Making a module public doesn't make it's contents public
    pub mod hosting {
        pub fn add_to_waitlist() {
            todo!();
        }
        fn seat_at_table() {
            todo!();
        }
    }

    mod serving {
        fn take_order() {
            todo!();
        }

        fn serve_order() {
            todo!();
        }

        fn take_payment() {
            todo!();
        }
    }
}

mod back_of_house {
    fn fix_incorrect_order() {
        cook_order();
        super::deliver_order();
    }

    fn cook_order() {
        todo!();
    }

    // Structs can be public but fields stay private unless specified
    pub struct Breakfast {
        pub toast: String,
        seasonal_fruit: String,
    }

    impl Breakfast {
        pub fn summer(toast: &str) -> Breakfast {
            Breakfast {
                toast: String::from(toast),
                seasonal_fruit: String::from("peaches"),
            }
        }
    }

    // all variants of a public enum are public
    pub enum Appetizer {
        Soup,
        Salad,
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn it_works() {
        let result = add(2, 2);
        assert_eq!(result, 4);
    }
}
