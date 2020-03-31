package com.leetcode.practice;

public class BuyAndSellStock {

    public static void main(String[] args) {

    }

    public static int maxProfit(int[] nums) {

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int index = 0; index < nums.length; index++) {

            if(nums[index] < minPrice)
                minPrice = nums[index];
            else if (nums[index]- minPrice > maxProfit)
                maxProfit = nums[index]-minPrice;
        }

        return maxProfit;
    }
}
