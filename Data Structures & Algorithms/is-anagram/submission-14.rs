impl Solution {
    fn to_counter_map(s: String) -> HashMap<char, i32> {
        let mut counter_map = HashMap::new();

        for c in s.chars() {
            *counter_map.entry(c).or_insert(0) += 1;
        }

        counter_map
    }

    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }

        let s_counter_map = Solution::to_counter_map(s);
        let t_counter_map = Solution::to_counter_map(t);

        s_counter_map == t_counter_map
    }
}
