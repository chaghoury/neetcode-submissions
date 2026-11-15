impl Solution {
    pub fn longest_common_prefix(strs: Vec<String>) -> String {
        if strs.len() == 0 {
            return String::new();
        }

        let mut result = strs[0].clone();

        while result != "" {
            for idx in 1..strs.len() {
                let str = &strs[idx];
                while result != "" && !str.starts_with(&result) {
                    result.pop();
                }
            }

            return result;
        }

        result
    }
}
