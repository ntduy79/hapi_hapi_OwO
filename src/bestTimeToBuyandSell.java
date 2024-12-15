// Say you have an array for which the ith element is the price of a given stock on day 1

// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock)
// design an algorithm to find the max profit

// Example 1:
// Input: [7, 1, 5, 3 ,6 ,4]
// Output: 5


// ntduy: in day 1, array[0], the price is 7, day 2 the price is 1, which means we don't get any profit from this
// we buy at day 2, and sell at day 3, we will have profit = 5, but since the math is asking us what is max profit
// ideally, we should sell at day 5, when the stock is at 6, so the maxProfit = 6-1 = 5 rather than 5-1 =4.

// Example 2:
// Input: [7, 6, 4, 3, 1]
// Output: 0

//ntduy: in this example, the price is decreasing, which means we will have no profit from this


public class bestTimeToBuyandSell {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
