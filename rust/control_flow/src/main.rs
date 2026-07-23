// Patterns can also bind to values
#[derive(Debug)]
enum UsState {
    Alabama,
    Alaska,
    Arizona,
    Arkansas,
    California,
    Colorado,
    Connecticut,
    Delaware,
    Florida,
    Georgia,
    Hawaii,
    Idaho,
    Illinois,
    Indiana,
    Iowa,
    Kansas,
    Kentucky,
    Louisiana,
    Maine,
    Maryland,
    Massachusetts,
    Michigan,
    Minnesota,
    Mississippi,
    Missouri,
    Montana,
    Nebraska,
    Nevada,
    NewHampshire,
    NewJersey,
    NewMexico,
    NewYork,
    NorthCarolina,
    NorthDakota,
    Ohio,
    Oklahoma,
    Oregon,
    Pennsylvania,
    RhodeIsland,
    SouthCarolina,
    SouthDakota,
    Tennessee,
    Texas,
    Utah,
    Vermont,
    Virginia,
    Washington,
    WestVirginia,
    Wisconsin,
    Wyoming,
}

impl UsState {
    fn existed_in(&self, year: u16) -> bool {
        match self {
            UsState::Delaware => year >= 1787,
            UsState::Pennsylvania => year >= 1787,
            UsState::NewJersey => year >= 1787,
            UsState::Georgia => year >= 1788,
            UsState::Connecticut => year >= 1788,
            UsState::Massachusetts => year >= 1788,
            UsState::Maryland => year >= 1788,
            UsState::SouthCarolina => year >= 1788,
            UsState::NewHampshire => year >= 1788,
            UsState::Virginia => year >= 1788,
            UsState::NewYork => year >= 1788,
            UsState::NorthCarolina => year >= 1789,
            UsState::RhodeIsland => year >= 1790,
            UsState::Vermont => year >= 1791,
            UsState::Kentucky => year >= 1792,
            UsState::Tennessee => year >= 1796,
            UsState::Ohio => year >= 1803,
            UsState::Louisiana => year >= 1812,
            UsState::Indiana => year >= 1816,
            UsState::Mississippi => year >= 1817,
            UsState::Illinois => year >= 1818,
            UsState::Alabama => year >= 1819,
            UsState::Maine => year >= 1820,
            UsState::Missouri => year >= 1821,
            UsState::Arkansas => year >= 1836,
            UsState::Michigan => year >= 1837,
            UsState::Florida => year >= 1845,
            UsState::Texas => year >= 1845,
            UsState::Iowa => year >= 1846,
            UsState::Wisconsin => year >= 1848,
            UsState::California => year >= 1850,
            UsState::Minnesota => year >= 1858,
            UsState::Oregon => year >= 1859,
            UsState::Kansas => year >= 1861,
            UsState::WestVirginia => year >= 1863,
            UsState::Nevada => year >= 1864,
            UsState::Nebraska => year >= 1867,
            UsState::Colorado => year >= 1876,
            UsState::NorthDakota => year >= 1889,
            UsState::SouthDakota => year >= 1889,
            UsState::Montana => year >= 1889,
            UsState::Washington => year >= 1889,
            UsState::Idaho => year >= 1890,
            UsState::Wyoming => year >= 1890,
            UsState::Utah => year >= 1896,
            UsState::Oklahoma => year >= 1907,
            UsState::NewMexico => year >= 1912,
            UsState::Arizona => year >= 1912,
            UsState::Alaska => year >= 1959,
            UsState::Hawaii => year >= 1959,
        }
    }
}

enum Coin {
    Penny,
    Nickel,
    Dime,
    // As an example; some quarters have state designs on one side
    Quarter(UsState),
}

fn main() {
    let five = Some(5);
    let six = plus_one(five);
    let none = plus_one(None);

    // 'Other' covers every other possible value
    let dice_roll = 9;

    match dice_roll {
        3 => add_fancy_hat(),
        7 => remove_fancy_hat(),
        other => move_player(other),
        // If value doesn't bind use wildcard (_)
    }

    // `if let`
    let config_max = Some(3u8);
    match config_max {
        Some(max) => println!("The maximum is configured to be {max}"),
        _ => (),
    }

    // More concise method of above using `if let`
    let config_max = Some(10u8);
    if let Some(max) = config_max {
        println!("The maximum is configured to be {max}");
    }

    // Using `if let` on the coin
    let mut count = 0;
    if let Coin::Quarter(state) = coin {
        println!("State quarter from {state:?}!");
    } else {
        count += 1;
    }
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => {
            // Still returns last value of block
            println!("Lucky penny!");
            1
        }
        Coin::Nickel => 5,
        Coin::Dime => 10,
        Coin::Quarter(state) => {
            println!("State quarter from {state:?}!");
            25
        }
    }
}

fn plus_one(x: Option<i32>) -> Option<i32> {
    match x {
        None => None,
        Some(i) => Some(i + 1),
    }
}

fn add_fancy_hat() {
    todo!();
}

fn remove_fancy_hat() {
    todo!();
}

fn move_player(num_spaces: u8) {
    todo!();
}

// `let else`
fn describe_state_quarter(coin: Coin) -> Option<String> {
    let Coin::Quarter(state) = coin else {
        return None;
    };

    if state.existed_in(1900) {
        Some(format!("{state:?} is pretty old, for America!"))
    } else {
        Some(format!("{state:?} is relatively new."))
    }
}
