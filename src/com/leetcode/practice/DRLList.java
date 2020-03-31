package com.leetcode.practice;

public class DRLList {

    public static void main(String[] args) {

        for (int n: new DRLList().decompressRLElist(new int[]{1,2,3,4,5,3})) {
            System.out.println(n);
        }
    }

    public int[] decompressRLElist(int[] nums) {
        /* Calculate DRL list size*/
        int size = 0;
        for (int i = 0; i < nums.length; i += 2)
            size += nums[i];

        int[] DRL = new int[size];

        int index = 0;

        for (int i = 0; i <= nums.length-1; i += 2) {
            int freq = nums[i];
            while (freq-->0) {
                DRL[index++] = nums[i+1];
            }
        }

        return DRL;
    }
}
