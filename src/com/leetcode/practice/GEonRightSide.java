package com.leetcode.practice;

public class GEonRightSide {

    public static void main(String[] args) {


    }

    public int[] replaceElements(int[] arr) {

        if (arr == null || arr.length == 0)
            return arr;
        int max = -1;
        for (int i = arr.length-1; i>=0; i--) {
            max = Math.max(max,arr[i]);
            arr[i] = max;
        }
        arr[arr.length-1] = -1;

        return arr;
    }


}
