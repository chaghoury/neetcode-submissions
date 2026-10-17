class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        for (int i = 0; i < nums.length; i ++) {
            int current = nums[i];
            int prev = i == 0 ? 0 : leftSum[i - 1];
            leftSum[i] = current + prev;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int current = nums[i];
            int prev = i == nums.length - 1 ? 0 : rightSum[i + 1];
            rightSum[i] = current + prev;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }

        return -1;
    }
}