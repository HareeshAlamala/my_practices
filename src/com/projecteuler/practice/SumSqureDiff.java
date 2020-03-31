package com.projecteuler.practice;

public class SumSqureDiff {

    private static int NUM_LIMIT = 100;

    public static void main(String[] args) {

        long sumOfSquares = 0L;

        long sumSquare = 0L;


        for (int i = 1; i <= NUM_LIMIT; i++) {
            sumOfSquares += i*i;
            sumSquare += i;
        }

        System.out.println(sumSquare*sumSquare-sumOfSquares);

    }
}
