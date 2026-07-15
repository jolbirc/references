fn main() {
    let day_one = "a patridge in a pear tree!\n";
    let day_two = "two turtle doves,";
    let day_three = "three French hens,";
    let day_four = "four calling birds,";
    let day_five = "five golden rings,";
    let day_six = "six geese a-laying,";
    let day_seven = "seven swans a-swimming,";
    let day_eight = "eight maids a-milking,";
    let day_nine = "nine ladies dancing,";
    let day_ten = "ten lords a-leaping,";
    let day_eleven = "eleven pipers piping,";
    let day_twelve = "twelve drummers drumming,";

    let days_array: [&str; 12] = [
        day_one, day_two, day_three, day_four, day_five, day_six, day_seven, day_eight, day_nine,
        day_ten, day_eleven, day_twelve,
    ];

    for day in 1..13 {
        if day == 1 {
            println!("On the {day}st day of Christmas my true love gave to me,");
        } else if day == 2 {
            println!("On the {day}nd day of Christmas my true love gave to me,");
        } else if day == 3 {
            println!("On the {day}rd day of Christmas my true love gave to me,");
        } else {
            println!("On the {day}th day of Christmas my true love gave to me,");
        }

        for i in (0..day).rev() {
            println!("{}", days_array[i]);
            if i == 1 {
                print!("and ")
            }
        }
    }
}
