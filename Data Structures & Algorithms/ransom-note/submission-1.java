class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> reference = getCounter(magazine.toCharArray());
        Map<Character, Integer> source = getCounter(ransomNote.toCharArray());

        for (Map.Entry<Character, Integer> entry : source.entrySet()) {
            if (
                !reference.containsKey(entry.getKey())
                || entry.getValue() > reference.get(entry.getKey())
            ) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> getCounter(char[] characters) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char character : characters) {
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }

        return counter;
    }
}