class Solution {

    public boolean isPalindrome(char[] chars) {
        int leftPointerIndex = 0;
        int rightPointerIndex = chars.length - 1;

        while (leftPointerIndex < rightPointerIndex) {
            int leftCharValue = chars[leftPointerIndex];
            int rightcharValue = chars[rightPointerIndex];

            if (leftCharValue != rightcharValue) {
                return false;
            }

            leftPointerIndex++;
            rightPointerIndex--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int leftPointerIndex = 0;
        int rightPointerIndex = chars.length - 1;

        while (leftPointerIndex < rightPointerIndex) {
            int leftCharValue = chars[leftPointerIndex];
            int rightcharValue = chars[rightPointerIndex];

            if (leftCharValue != rightcharValue) {
                String leftSubChars = s.substring(0, leftPointerIndex) + s.substring(leftPointerIndex + 1);
                String rightSubChars = s.substring(0, rightPointerIndex) + s.substring(rightPointerIndex + 1);

                return isPalindrome(leftSubChars.toCharArray()) || isPalindrome(rightSubChars.toCharArray());
            }

            leftPointerIndex++;
            rightPointerIndex--;
        }

        return true;
    }

}