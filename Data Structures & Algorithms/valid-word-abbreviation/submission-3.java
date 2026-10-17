class Solution {

    public static boolean isNumerical(char character) {
        return character >= (int) '0' && character <= (int) '9';
    }

    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        char[] chars = word.toCharArray();
        char[] abbrs = abbr.toCharArray();

        while  (j < abbrs.length && i < chars.length) {
            if (abbrs[j] == chars[i]) {
                j++;
                i++;
                continue;
            }

            if (!isNumerical(abbrs[j])) {
                return false;
            }

            String numericalRepresentation = "";
            while (j < abbrs.length && isNumerical(abbrs[j])) {
                numericalRepresentation += String.valueOf(abbrs[j]);
                j++;
            }
            if (numericalRepresentation.startsWith("0")) {
                return false;
            }
            int charsToSkipp =Integer.parseInt(numericalRepresentation);

            i+= charsToSkipp;
        }

        return i == chars.length && j == abbrs.length;
    }
}