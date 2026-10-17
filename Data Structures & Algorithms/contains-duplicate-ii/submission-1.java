class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> dictionary = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            if (dictionary.containsKey(nums[j])) {
                int i = dictionary.get(nums[j]);

                if (Math.abs(i - j) <= k) {
                    return true;
                }
            }
            
            dictionary.put(nums[j], j);
        }

        return false;
    }
}