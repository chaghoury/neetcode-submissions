class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        Map<Integer, Integer> trackedElements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            int elementNeeded = target - value;
            if (trackedElements.containsKey(elementNeeded)) {
                int neededIndex = trackedElements.get(elementNeeded);
                results[0] = neededIndex;
                results[1] = i;

                return results;
            }

            trackedElements.put(value, i);
        }


        return results;
    }
}
