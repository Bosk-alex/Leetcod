package data_structure.day_3;

import java.util.Arrays;

public class BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(Arrays.toString(prices));

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
            } else {
                profit = Math.max(profit, prices[sell] - prices[buy]);
                sell++;
            }

        }

        return profit;
    }
}
