package com.interviewBit;

import java.util.Arrays;
import java.util.List;

public class MaxDiff {

    /**
     * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
     * f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
     */
    public static void main(String[] args) {

        System.out.println(getMaxDiff(Arrays.asList(1,3,-1)));
    }

    public static int getMaxDiff(List<Integer> A) {

        int maxSum = A.get(0);

        int minSum = maxSum;

        for (int index = 0; index < A.size(); index++) {
            maxSum = Math.max(maxSum, A.get(index)+index);
            minSum = Math.min(minSum, A.get(index)+index);
        }

        int maxDiff = A.get(0);

        int minDiff = maxDiff;

        for (int index = 0; index < A.size(); index++) {
            maxDiff = Math.max(maxDiff, A.get(index) - index);
            minDiff = Math.min(minDiff, A.get(index)- index);
        }

        return Math.max((maxDiff-minDiff), (maxSum-minSum));
    }
}
