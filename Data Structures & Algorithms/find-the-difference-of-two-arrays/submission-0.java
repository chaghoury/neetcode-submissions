class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int num : nums1) {
            firstSet.add(num);
        }

        for (int num : nums2) {
            secondSet.add(num);
        }

        List<Integer> missingInSecond = new LinkedList<>();
        for (int num : firstSet) {
            if (!secondSet.contains(num)) {
                missingInSecond.add(num);
            }
        }

        List<Integer> missingInFirst = new LinkedList<>();
        for (int num : secondSet) {
            if (!firstSet.contains(num)) {
                missingInFirst.add(num);
            }
        }

        return List.of(missingInSecond, missingInFirst);
    }
}