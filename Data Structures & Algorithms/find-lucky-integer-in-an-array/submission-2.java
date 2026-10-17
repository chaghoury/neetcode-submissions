class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int value : arr) {
            counter.put(value, counter.getOrDefault(value, 0) + 1);
        }

        int luckiestNumberFound = -1;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                luckiestNumberFound = Math.max(luckiestNumberFound, entry.getValue());
            }
        }

        return luckiestNumberFound;
    }
}