pub fn add(left: u64, right: u64) -> u64 {
    left + right
}

pub fn eat_at_restaurant() {
    // Absolute path
    crate::front_of_house::hosting::add_to_waitlist();

    // Relative path
    front_of_house::hosting::add_to_waitlist();
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

mod front_of_house {
    mod hosting {
        fn add_to_waitlist() {
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
