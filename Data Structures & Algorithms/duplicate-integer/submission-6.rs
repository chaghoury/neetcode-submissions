impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {
        let mut already_seen: HashSet<i32> = HashSet::new();

        for num in nums {
            if already_seen.contains(&num) {
                return true;
            }

            already_seen.insert(num);
        }

        return false;
    }
}