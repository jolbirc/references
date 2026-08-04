// use std::{collections::HashMap, vec};

fn main() {
    let mut nums = vec![
        4, 19, 20, 6, 16, 16, 16, 81, 23, 48, 20, 100, 200, 400, 401, 222,
    ];
    let result_median = median(&mut nums);
    let result_mode = mode(&mut nums);
    println!("{result_median}");
    println!("{result_mode}");
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

fn mode(nums: &mut Vec<i32>) -> i32 {
    let mut map = std::collections::HashMap::new();

    for num in nums {
        let count = map.entry(num).or_insert(0);
        *count += 1;
    }

    let mut max_count = 0;
    let mut mode = 0;

    for (num, count) in map {
        if count > max_count {
            max_count = count;
            mode = *num;
        }
    }

    mode
}
