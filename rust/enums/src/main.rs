enum IpAddrKind {
    V4,
    V6,
}

enum IpAddr {
    V4(String),
    V6(String),
}

enum Message {
    Quit,
    Move { x: i32, y: i32 },
    Write(String),
    ChangeColour(i32, i32, i32),
}

impl Message {
    fn call(&self) {
        todo!()
    }
}

fn main() {
    let four = IpAddrKind::V4;
    let six = IpAddrKind::V6;

    let home = IpAddr::V4(String::from("127.0.0.1"));
    let loopback = IpAddr::V6(String::from("::1"));

    route(IpAddrKind::V4);
    route(IpAddrKind::V6);

    let m = Message::Write(String::from("hello"));
    m.call();

    // Option enum
    let some_number = Some(5);
    let some_char = Some('e');
    let absent_number: Option<i32> = None;
}

fn route(ip_kind: IpAddrKind) {
    todo!()
}
