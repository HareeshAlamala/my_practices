package com.leetcode.practice;

public class MergeArray {

    public static void main(String[] args) {

        int[] nums1 = {1,2,5,0,0,0,0};
        int[] nums2 = {2, 3, 6,9};
        merge(nums1,3,nums2,4);


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = n-1; i >= 0; i--) {

            int last = nums1[m-1];
            int j;
            for (j = m-2; j >= 0 && nums1[j] > nums2[i];j--)
                nums1[j+1] = nums1[j];

            if(j != m-2 || last > nums2[i]) {
                nums1[j+1] = nums2[i];
                nums2[i] = last;
            }

        }
        for (int i = m; i < (m+n); i++) {
            nums1[i] = nums2[i-m];
        }

        for (int in: nums1) {
            System.out.println("->"+in);
        }



    }
}
