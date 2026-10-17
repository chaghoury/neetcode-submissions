class Solution {

    private static Boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (int i = 0; i < firstChars.length; i++) {
            firstMap.put(firstChars[i], firstMap.getOrDefault(firstChars[i], 0) + 1);
            secondMap.put(secondChars[i], secondMap.getOrDefault(secondChars[i], 0) + 1);
        }

        return firstMap.equals(secondMap);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (areAnagrams(key, str)) {
                if (groupedAnagrams.containsKey(key)) {
                    groupedAnagrams.get(key).add(str);
                } else {
                    List<String> values = new LinkedList<String>();
                    values.add(str);
                    groupedAnagrams.put(key, values);
                }
            }
        }

        return groupedAnagrams
            .values()
            .stream()
            .toList();
    }
}
