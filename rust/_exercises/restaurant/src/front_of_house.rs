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
