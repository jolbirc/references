// use std::{collections::HashMap, vec};

fn main() {
    let mut nums = vec![4, 19, 20, 6, 16, 81, 23, 48, 20, 100, 200, 400, 401, 222];
    let result = median(&mut nums);
    println!("{result}");
}

fn median(nums: &mut Vec<i32>) -> f64 {
    nums.sort();
    let mid = nums.len() / 2;

    if nums.len() % 2 == 0 {
        (nums[mid - 1] + nums[mid]) as f64 / 2.0
    } else {
        nums[mid] as f64
    }
}
