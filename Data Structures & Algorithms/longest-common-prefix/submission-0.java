class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (String str : strs) {
            while(!str.contains(prefix) && !prefix.isEmpty()) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }
}