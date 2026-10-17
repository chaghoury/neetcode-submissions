class Solution {
    public boolean confusingNumber(int n) {
        Set<Integer> invalidNumbers = new HashSet<>(List.of(2, 3, 4, 5, 7));
        char[] chars = String.valueOf(n).toCharArray();
        String rotatedValue = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            char character = chars[i];
            int number = Integer.parseInt(String.valueOf(character));
            if (invalidNumbers.contains(number)) {
                return false;
            }

            if (character == '6') {
                rotatedValue += '9';
            } else if (character == '9') {
                rotatedValue += '6';
            } else {
                rotatedValue += character;
            }
        }

        int rotatedNumber = Integer.parseInt(rotatedValue);
        boolean isConfusing = rotatedNumber != n;

        return isConfusing;
    }
}
