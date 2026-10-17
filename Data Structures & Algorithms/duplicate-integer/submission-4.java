class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbersSeen = new HashSet<>();

        for (int number : nums) {
            if (numbersSeen.contains(number)) {
                return true;
            }

            numbersSeen.add(number);
        }

        return false;
    }
}