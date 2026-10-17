class Solution {
    public int firstUniqChar(String s) {
        char[] characters = s.toCharArray();
        Map<Character, Integer> counter = new HashMap<>();

        for (char character : characters) {
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }

        int uniqueCharIdx = -1;
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            if (counter.get(character) == 1) {
                uniqueCharIdx = i;
                break;
            }
        }

        return uniqueCharIdx;
    }
}