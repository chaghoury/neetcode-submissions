class Solution {

    private String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String sortedStr = String.valueOf(chars);

        return sortedStr;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            String key = sortStr(str);
            if (groups.containsKey(key)) {
                groups.get(key).add(str);
            } else {
                List<String> values = new LinkedList<>();
                values.add(str);

                groups.put(key, values);
            }
        }

        List<List<String>> results = new LinkedList<>();
        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            List<String> anagrams = entry.getValue();
            results.add(anagrams);
        }

        return results;
    }
}
