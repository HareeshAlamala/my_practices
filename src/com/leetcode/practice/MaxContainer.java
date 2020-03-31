package com.leetcode.practice;

public class MaxContainer {

    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {

        int start= 0;
        int end = height.length-1;

        int max = 0;

        while (start < end) {

            max = Math.max(max, Math.min(height[start],height[end])*(end-start));

            if (height[end] > height[start])
                start++;
            else
                end--;
        }

        return max;
    }
}
