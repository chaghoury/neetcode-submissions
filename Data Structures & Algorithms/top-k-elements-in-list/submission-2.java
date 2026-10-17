class Solution {
    
    private Map<Integer, Integer> getCounter(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        return counter;
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = getCounter(nums);

        List<Integer>[] occurences = new List[nums.length + 1];
        for (int i = 0; i < occurences.length; i++) {
            occurences[i] = new LinkedList<>();
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int reps = entry.getKey();
            int keyIndex = entry.getValue();

            occurences[keyIndex].add(reps);
        }

        int elementsFound = 0;
        int[] results = new int[k];
        for (int i = occurences.length - 1; i >= 0 && elementsFound < k; i--) {
            if (occurences[i].size() > 0) {
                for (int num : occurences[i]) {
                    results[elementsFound] = num;
                    elementsFound++;
                }
            }
        }

        return results;
    }
}
