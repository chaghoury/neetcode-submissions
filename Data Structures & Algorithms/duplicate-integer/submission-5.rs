impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {
        let mut existing_nums: HashSet<i32> = HashSet::new();

        for num in nums {
            if existing_nums.contains(&num) {
                return true;
            }

            existing_nums.insert(num);
        }

        return false;
    }
}