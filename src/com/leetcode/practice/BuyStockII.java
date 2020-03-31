package com.leetcode.practice;

public class BuyStockII {

    public static void main(String[] args) {

        System.out.println(new BuyStockII().maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max = 0;
        int prev = min;
        for (int i = 1; i < prices.length; i++) {
            if (prev > prices[i]) {
                max = max + profit;
                profit = 0;
                min = prices[i];
            } else {

                profit = Math.max(profit, prices[i]-min);
                if (min > prices[i])
                    min = prices[i];
            }

            prev = prices[i];



        }

        if (profit != 0)
            max += profit;
        return max;
    }
}
