package com.leetcode.practice;

import java.util.Arrays;

public class CountPrimes {

    public static void main(String[] args) {

    }

    public int countPrimes(int n) {

        boolean[] PRIME_NUMS = new boolean[n];

        Arrays.fill(PRIME_NUMS,true);

        for (int i = 2; i < n/2; i++) {
            int j = i;
            int multiply = 2;

            j = j*multiply;
            while (j < n ) {
               PRIME_NUMS[j] = false;
               j *= ++multiply;
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (PRIME_NUMS[i])
                count++;
        }

        return count;
    }
}
