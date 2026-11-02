class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                results[0] = map.get(complement);
                results[1] = i;

                return results;
            }

            map.put(nums[i], i);
        }

        return results;
    }
}
