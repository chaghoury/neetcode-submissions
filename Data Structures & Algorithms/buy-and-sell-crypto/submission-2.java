class Solution {

    // as requirement provided we default the profitable margin to zero
    private static final Integer DEFAULT_PROFITTABLE_AMOUNT = 0;

    public int maxProfit(int[] prices) {
        // if the list of prices is empty of only contains one day, no profits can be made
        if (prices.length < 2) {
            return DEFAULT_PROFITTABLE_AMOUNT;
        }

        int leftIndex = 0; // initialize first pointer to the start of the list
        int rightIndex = leftIndex + 1; // initialize the second pointer to be next to the first one
        int maxProfitableMargin = DEFAULT_PROFITTABLE_AMOUNT; // initialize the default profit margin to zero

        // iterate till the end of the list
        while (rightIndex < prices.length) {
            // if the next day is cheaper than the current day
            // then we reset the left pointer to that day
            // because the profit will be negative, i.e: losing instead of gainning
            if (prices[rightIndex] < prices[leftIndex]) {
                leftIndex = rightIndex;
            } else {
                // we calculate the current profit than can be made
                // and we compare it the to the current hight profittable transaction
                // if it turns out to be more profitable then we set it as the max profittable transaction
                int currentProfitMargin = prices[rightIndex] - prices[leftIndex];
                maxProfitableMargin = Math.max(maxProfitableMargin, currentProfitMargin);
            }

            // for each iteration we increment the right pointer to the next element
            rightIndex++;
        }

        // we return the max profittable transaction amount
        // if non is profitable we return the defaulted valued of zero
        return maxProfitableMargin;
    }
}
