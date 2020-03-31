package com.g4g.practice.amz;

public class CountBitSet {

    public static void main(String[] args) {
        System.out.println(countBitSet(6));
    }

    public static int countBitSet(int n) {

        /**
         * Algo1: power of 2 has pair of number
         */

        int[] mem = new int[n+2];

        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <=n; i++) {

            if (i%2==0) {
                mem[i] = mem[i/2];
            } else
                mem[i] = mem[i-1] +1;
        }

        int sum= 0;

        for (int i: mem)
            sum += i;

        return sum;
    }
}
