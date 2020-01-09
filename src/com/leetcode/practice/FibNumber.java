package com.leetcode.practice;

public class FibNumber {

    public static void main(String[] args) {

        System.out.println(findFibNumber(3));

    }
    private static int findFibNumber(int N) {

        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return findFibNumber(N-1) + findFibNumber(N-2);
    }
}
