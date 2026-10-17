class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> existingNumbers = new HashSet<>();

        for (int number : nums) {
            if (existingNumbers.contains(number)) {
                return true;
            }

            existingNumbers.add(number);
        }

        return false;
    }
}
