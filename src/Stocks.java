public class Stocks {
    public static void main(String[] args) {
//        int [ ] prices = new int[]{7,6,4,3,1};
        int[] prices = new int[]{2, 4, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int buyDate = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyDate) {
                buyDate = prices[i];
            }

            if (prices[i] - buyDate > profit) {
                profit = prices[i] - buyDate;
            }
        }

        return profit;
    }
}
