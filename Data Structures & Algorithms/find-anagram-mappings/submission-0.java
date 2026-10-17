class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length];
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            mapping.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int indexFound = mapping.get(nums1[i]);
            results[i] = indexFound;
        }


        return results;
    }
}
