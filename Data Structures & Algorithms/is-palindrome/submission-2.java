class Solution {
    private static boolean isAlphanumeric(char character) {
        int asciiValue = (int) character;
        
        // (0-9)
        if (asciiValue >= (int) '0' && asciiValue <= (int) '9') {
            return true;
        }

        // (A-Z)
        if (asciiValue >= (int) 'A' && asciiValue <= (int) 'Z') {
            return true;
        }

        // (a-z)
        if (asciiValue >= (int) 'a' && asciiValue <= (int) 'z') {
            return true;
        }

        return false;
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int leftPointerIndex = 0;
        int rightPointerIndex = chars.length - 1;

        while (leftPointerIndex < rightPointerIndex) {
            while (leftPointerIndex < rightPointerIndex && !isAlphanumeric(chars[leftPointerIndex])) {
                leftPointerIndex++;
            }

            while (leftPointerIndex < rightPointerIndex && !isAlphanumeric(chars[rightPointerIndex])) {
                rightPointerIndex--;
            }

            int leftCharValue = (int) chars[leftPointerIndex] >= 97 ? (int) chars[leftPointerIndex] : ((int) chars[leftPointerIndex]) + 32;
            int rightCharValue = (int) chars[rightPointerIndex] >= 97 ? (int) chars[rightPointerIndex] : ((int) chars[rightPointerIndex] + 32);
            
            if (leftCharValue != rightCharValue) {
                return false;
            }

            leftPointerIndex++;
            rightPointerIndex--;
        }

        return true;
    }
}
