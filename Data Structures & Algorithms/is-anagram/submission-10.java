class Solution {

    private Map<Character, Integer> getWordCounter(char[] letters) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char letter : letters) {
            counter.put(letter, counter.getOrDefault(letter, 0) + 1);
        }

        return counter;
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = getWordCounter(s.toCharArray());
        Map<Character, Integer> second = getWordCounter(t.toCharArray());

        return first.equals(second);
    }
}
