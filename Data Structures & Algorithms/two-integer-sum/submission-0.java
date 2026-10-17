class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answers = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int remaining = target - value;

            if (map.containsKey(remaining)) {
                answers[0] = map.get(remaining);
                answers[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return answers;
    }
}
 