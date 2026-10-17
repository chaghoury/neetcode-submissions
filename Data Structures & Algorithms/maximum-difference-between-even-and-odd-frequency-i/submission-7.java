class Solution {
    public int maxDifference(String s) {
        char[] letters = s.toCharArray();
        Map<Character, Integer> counter = new HashMap<>();

        for (char letter : letters) {
            counter.put(letter, counter.getOrDefault(letter, 0) + 1);
        }


        int minEven = s.length();
        int maxOdd = -1;

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            int occurences = entry.getValue();
            if (occurences % 2 == 0) {
                minEven = Math.min(minEven, occurences);
            } else {
                maxOdd = Math.max(maxOdd, occurences);
            }
        }
        
        return (maxOdd - minEven);
    }
}