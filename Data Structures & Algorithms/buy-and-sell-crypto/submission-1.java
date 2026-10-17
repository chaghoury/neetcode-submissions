class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = leftIndex + 1;
        int maxProfitableMargin = 0;

        while (rightIndex < prices.length) {
            if (prices[rightIndex] < prices[leftIndex]) {
                leftIndex = rightIndex;
            } else {
                int currentProfitMargin = prices[rightIndex] - prices[leftIndex];
                maxProfitableMargin = Math.max(maxProfitableMargin, currentProfitMargin);
            }
            
            rightIndex++;
        }

        return maxProfitableMargin;
    }
}
