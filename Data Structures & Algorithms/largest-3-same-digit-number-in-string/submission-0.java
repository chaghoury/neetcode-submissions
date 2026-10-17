class Solution {
    public String largestGoodInteger(String num) {
        int biggestGoodIntegerFound = -1;
        char[] characters = num.toCharArray();

        for (int i = 0; i < characters.length - 2; i++) {
            int firstNumber = Integer.parseInt(String.valueOf(characters[i]));
            int secondNumber = Integer.parseInt(String.valueOf(characters[i + 1]));
            int thirdNumber = Integer.parseInt(String.valueOf(characters[i + 2]));

            if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                biggestGoodIntegerFound =
                    Math.max(biggestGoodIntegerFound, firstNumber);
            }
        }

        return biggestGoodIntegerFound == -1
            ? ""
            : "" + biggestGoodIntegerFound + biggestGoodIntegerFound + biggestGoodIntegerFound; 
    }
}