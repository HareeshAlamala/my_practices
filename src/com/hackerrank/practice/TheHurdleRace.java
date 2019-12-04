package com.hackerrank.practice;


import java.util.Arrays;

public class TheHurdleRace {

    public static void main(String[] args) {

    }
    private static int hurdleRace(int k, int[] height) {

        int maxHurdle = -1;
        for (int loop_i = 0; loop_i < height.length; loop_i++) {
            if(height[loop_i] > maxHurdle)
                maxHurdle = height[loop_i];
        }

        if(maxHurdle < k) {
            return 0;
        }

        return maxHurdle - k;

    }
}
