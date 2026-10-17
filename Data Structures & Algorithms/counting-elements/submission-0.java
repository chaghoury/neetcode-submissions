class Solution {
    public int countElements(int[] arr) {
        Set<Integer> existingNumbers = new HashSet<>();
        for (int number : arr) {
            existingNumbers.add(number);
        }

        int count = 0;
        for (int number: arr) {
            if (existingNumbers.contains(number + 1)) {
                count++;
            }
        }

        return count;
    }
}
