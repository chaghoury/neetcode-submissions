class Solution {

    private Map<Character, Integer> getCountedElement(char[] elements) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char element : elements) {
            counter.put(element, counter.getOrDefault(element, 0) + 1);
        }

        return counter;
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = getCountedElement(s.toCharArray());
        Map<Character, Integer> second = getCountedElement(t.toCharArray());

        return first.equals(second);
    }
}
