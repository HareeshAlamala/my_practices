package com.leetcode.practice;

public class SortArrayByParityII {

    public static void main(String[] args) {

    }
    public static int[] sortArrayByParityII(int[] A) {
        int slow_index = 0;
        int index = 1;
        while ( index < A.length && slow_index < A.length ) {
            if ((A[slow_index] &1 ) != 0) {
                int t = A[slow_index];
                A[slow_index] = A[index];
                A[index] = t;
                index = index +2;
            } else
                slow_index += 2;
        }

        return A;
    }
}
