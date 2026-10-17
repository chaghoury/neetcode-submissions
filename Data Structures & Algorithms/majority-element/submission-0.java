class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        int max = 0;
        int occurences = -1;

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);

            int numOfOccurences = counter.get(num);

            if (numOfOccurences > occurences) {
                max = num;
                occurences = numOfOccurences;
            }
        }

        return max;
    }
}