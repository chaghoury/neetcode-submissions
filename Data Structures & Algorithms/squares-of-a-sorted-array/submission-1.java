class Solution {
    public int[] sortedSquares(int[] nums) {
        // initializing the sorted squared results array
        int[] results = new int[nums.length];

        // initialize the pointer at the end of the array
        int idx = results.length - 1;

        int leftIdx = 0; // initialize left pointer (beginning of nums)
        int rightIdx = nums.length - 1; // initialize right pointer (end of nums)

        while (leftIdx <= rightIdx) {
            if (Math.abs(nums[leftIdx]) > Math.abs(nums[rightIdx])) {
                results[idx] = nums[leftIdx] * nums[leftIdx];
                leftIdx++;
            } else {
                results[idx] = nums[rightIdx] * nums[rightIdx];
                rightIdx--;
            }

            idx--;
        }

        return results;
    }
}