class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (char character : first) {
            firstMap.put(character, firstMap.getOrDefault(character, 0) + 1);
        }

        for (char character : second) {
            secondMap.put(character, secondMap.getOrDefault(character, 0) + 1);
        }

        return firstMap.equals(secondMap);
    }
}
