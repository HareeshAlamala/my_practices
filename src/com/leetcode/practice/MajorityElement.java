package com.leetcode.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ahareesh
 */
/*Problem statement: Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times. */

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0 ; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        majorityElement(nums);

    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int times = nums.length/2;
        for(int i = 0; i < nums.length; i++) {
           if(nums[i] == nums[i+times]){
               return nums[i];
           }
        }
        return 0;
    }
}
