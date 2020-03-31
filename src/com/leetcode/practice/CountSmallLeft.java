package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class CountSmallLeft {

    public static void main(String[] args) {

    }


    public List<Integer> countSmaller(int[] nums) {


        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
           int count = 0;
            for (int j = index + 1; j < nums.length; j++) {
               if (nums[index] > nums[j])
                   count++;
            }
            result.add(count);
        }

        return result;
    }
}
