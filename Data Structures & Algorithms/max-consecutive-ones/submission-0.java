class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int i = 0;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }

            int currentMax = 0;
            while(i < nums.length && nums[i] == 1) {
                currentMax++;
                i++;
            }

            max = Math.max(max, currentMax);
        }


        return max;
    }
}