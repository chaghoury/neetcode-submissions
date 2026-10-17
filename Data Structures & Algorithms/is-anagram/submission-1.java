class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            firstMap.put(first[i], firstMap.getOrDefault(first[i], 0) + 1);
            secondMap.put(second[i], secondMap.getOrDefault(second[i], 0) + 1);
        }

        return firstMap.equals(secondMap);
    }
}
