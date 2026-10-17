class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;


        while (leftIndex < rightIndex) {
            if (nums[leftIndex] % 2 == 0 && nums[rightIndex] % 2 != 0) {
                leftIndex++;
                rightIndex--;
            } else if (nums[leftIndex] % 2 != 0 && nums[rightIndex] % 2 == 0) {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            } else if (nums[leftIndex] % 2 == 0 && nums[rightIndex] % 2 == 0) {
                leftIndex++;
            } else if (nums[leftIndex] % 2 != 0 && nums[rightIndex] % 2 != 0) {
                rightIndex--;
            }
        }

        return nums;
    }
}