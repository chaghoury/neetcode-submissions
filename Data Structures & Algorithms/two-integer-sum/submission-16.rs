impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut indexed_values = HashMap::new();

        for (index, value) in nums.iter().enumerate() {
            let complement = target - value;

            if indexed_values.contains_key(&complement) {
                let first_index = indexed_values.get(&complement).unwrap();
                let second_index: i32 = index as i32;

                return vec![*first_index, second_index];
            }
            indexed_values.insert(value, index as i32);
        }

        vec![]
    }
}