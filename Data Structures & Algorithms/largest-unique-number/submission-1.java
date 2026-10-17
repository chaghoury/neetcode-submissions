class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int number : nums) {
            counter.put(number, counter.getOrDefault(number, 0) + 1);
        }

        int maxFound = -1;
        for (Map.Entry<Integer, Integer> entry: counter.entrySet()) {
            int number = entry.getKey();
            int occurrences = entry.getValue();
            if (occurrences == 1 && maxFound < number) {
                maxFound = number;
            }
        }

        return maxFound;
    }
}
