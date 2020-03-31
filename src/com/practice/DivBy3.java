package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DivBy3 {

    public static void main(String[] args) {
        int[] arr = {0,4,6,8};
        System.out.println(new DivBy3().solution(arr,2));


    }

    public long solution(int[] arr , int k) {
        if (arr[0] == 0) {
            arr[0] = arr[1];
            arr[1] = 0;
        }

        StringBuilder bf = new StringBuilder(arr.length+1);
        for (int i : arr) {
            bf.append(i);
        }
        String str = bf.toString().trim();
        int dp[][] = new int[str.length()+1][str.length()+1];
        for (int i = 0; i <= str.length(); i++)
            for (int j = 0; j <=str.length();j++)
                dp[i][j] = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); ++i) {
            int t1 = str.charAt(i) - '0';
            dp[i + 1][1] = Math.min(dp[i][1], t1 >0 ? t1: Integer.MAX_VALUE);
            for (int j = 2; j <= k; ++j) {
                int t  = dp[i][j - 1] * 10 + str.charAt(i) - '0';
                dp[i + 1][j] = Math.min(t >0 ?t%3==0?t:Integer.MAX_VALUE: Integer.MAX_VALUE, dp[i][j]);
            }
        }


        return dp[str.length()][k];



    }
}
