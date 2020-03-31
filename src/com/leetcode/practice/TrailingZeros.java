package com.leetcode.practice;

public class TrailingZeros {

    public static void main(String[] args) {
        System.out.println(new TrailingZeros().tailZero(10));
    }

    public int tailZero(int n) {
        int numOfFives = 0;
        while(n >=5) {
            numOfFives += n/5;
            n = n/5;
        }

        return numOfFives;
    }

}
