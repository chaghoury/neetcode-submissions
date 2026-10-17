class Solution {
    public int removeElement(int[] nums, int val) {
        int leftPointer = 0;
        int rightPointer = nums.length;

        while (leftPointer < rightPointer) {
            if (nums[leftPointer] == val) {
                nums[leftPointer] = nums[rightPointer - 1];
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        return rightPointer;
    }
}