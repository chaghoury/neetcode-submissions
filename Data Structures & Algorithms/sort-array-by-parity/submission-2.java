class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            int leftVal = nums[leftIndex];
            int rightVal = nums[rightIndex];

            // both are odd
            if (leftVal % 2 != 0 && rightVal % 2 != 0) {
                rightIndex--;
            }

            if (leftVal % 2 != 0 && rightVal % 2 == 0) {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }

            if (leftVal % 2 == 0 && rightVal % 2 != 0) {
                leftIndex++;
                rightIndex--;
            }

            if (leftVal % 2 == 0 && rightVal % 2 == 0) {
                leftIndex++;
            }
        }

        return nums;
    }
}