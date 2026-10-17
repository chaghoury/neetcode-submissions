class Solution {
    public void reverseString(char[] s) {
        int leftPointerIndex = 0;
        int rightPointerIndex = s.length - 1;

        while (leftPointerIndex < rightPointerIndex) {
            char leftValue = s[leftPointerIndex];
            char rightValue = s[rightPointerIndex];

            s[leftPointerIndex] = rightValue;
            s[rightPointerIndex] = leftValue;
            
            leftPointerIndex++;
            rightPointerIndex--;
        }
    }
}