package com.hackerrank.practice;

public class StrangeAdvertising {
    public static void main(String[] args) {


    }
    private static int viralAdvertising(int n) {
        int numberOfShares = 5;
        int cummulativeSum = 0;
        while (n-->0) {
            int numberOfLikes = 5/2;
            cummulativeSum += numberOfLikes;
            numberOfShares = numberOfLikes*3;
        }
        return cummulativeSum;
    }
}
