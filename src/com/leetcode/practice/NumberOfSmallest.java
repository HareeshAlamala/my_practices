package com.leetcode.practice;

import java.util.Arrays;

public class NumberOfSmallest {

    public static void main(String[] args) {


    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy = Arrays.copyOf(nums,nums.length);

        Arrays.sort(copy);

        int[] op = new int[copy.length];

        for (int i = 0; i < nums.length; i++) {
            op[i] = doBinarySearch(copy,nums[i]);
        }

        return op;

    }

    private int doBinarySearch(int[] nums, int key) {

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = (left + right)/2;

            if (nums[mid] < key)
                left = mid + 1;
            else
                right = mid;
        }

        return  left ;
    }
}
