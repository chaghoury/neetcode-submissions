class Solution {
    public int calculateTime(String keyboard, String word) {
        char[] chars = keyboard.toCharArray();
        Map<Character, Integer> positions = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            positions.put(chars[i], i);
        }

        int result = 0;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            int letter = positions.get(letters[i]);
            int prevLetter = i == 0 ? 0 :positions.get(letters[i - 1]);
            result += Math.abs(letter - prevLetter);
        }

        return result;
    }
}
