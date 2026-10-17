class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstNums = new HashSet<>();
        for (int num : nums1) {
            firstNums.add(num);
        }

        Set<Integer> secondNums = new HashSet<>();
        for (int num : nums2) {
            secondNums.add(num);
        }

        Set<Integer> commonNums = new HashSet<>();
        for (int num : firstNums) {
            if (secondNums.contains(num)) {
                commonNums.add(num);
            }
        }

        return commonNums.stream().mapToInt(Integer::intValue).toArray();
    }
}