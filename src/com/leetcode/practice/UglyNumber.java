package com.leetcode.practice;

public class UglyNumber {

    public static void main(String[] args) {

        System.out.println(new UglyNumber().isUgly(14));
    }

    public boolean isUgly(int n) {

        int result = checkFivePrimeFactor(n,5);
        result = checkFivePrimeFactor(result,3);
        result = checkFivePrimeFactor(result,2);

        return result==1;
    }

    public int checkFivePrimeFactor(int n, int factor) {

        if (n%factor != 0)
            return n;

        while (n%factor == 0) {
            n = n/factor;
        }

        System.out.println("Value :"+n+", factor: "+factor);
        return n;
    }
}
