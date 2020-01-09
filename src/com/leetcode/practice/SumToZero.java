package com.leetcode.practice;

public class SumToZero {

    public static void main(String[] args) {

        //System.out.println("--->"+sumToZero(5));
        int[] arr = sumToZero(5);
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static int[] sumToZero(int n) {

        int[] arr = new int[n];
        int index = 0;

        int start = -n/2;

        while (start != 0) {
            arr[index++] = start++;
        }

        if ((n & 1) != 0)
            arr[index++] = start++;
        else
            start++;
        while (index < n)
            arr[index++] = start++;


        return arr;
    }
}
