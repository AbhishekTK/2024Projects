public class Solution2 {

    // 121. Best time to buy and sell stock
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 7, 6, 4, 3, 1 };
        // int[] prices = { 7, 6, 4, 3, 1, 8 };

        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }

        System.out.println(profit);

    }
}
