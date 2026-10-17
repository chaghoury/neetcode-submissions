class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] != 0) {
            i++;
        }

        int j = i;
        while (j < nums.length && nums[j] == 0) {
            j++;
        }

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
            j++;
        }
    }
}