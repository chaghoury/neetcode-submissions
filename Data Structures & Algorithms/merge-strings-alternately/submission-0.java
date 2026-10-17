class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        int n = Math.max(first.length, second.length);
        String result = "";

        int i = 0;
        while (i < n) {
            if (i < first.length) {
                result += first[i];
            }

            if (i < second.length) {
                result += second[i];
            }

            i++;
        }

        return result;
    }
}