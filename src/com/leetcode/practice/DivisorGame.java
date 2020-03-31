package com.leetcode.practice;

public class DivisorGame {

    public static void main(String[] args) {

        System.out.println(new DivisorGame().divisorGame(15));
    }

    public boolean divisorGame(int N) {

        return (countGame(N) & 1) == 1;
    }

    private int countGame(int N) {

        if (N <= 1)
            return 0;
        if (N == 2)
            return 1;
        return 1 + countGame(getOptimalNumber(N));
    }

    private int getOptimalNumber(int N) {


        int divisor = N/2;

        while (divisor >=1 && N%divisor-- != 0);

        return N-divisor-1;

    }
}
