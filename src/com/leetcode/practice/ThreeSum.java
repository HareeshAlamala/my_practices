package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

    }


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i+1;
                int high = nums.length-1;


                while (low < high) {

                    if (nums[low] + nums[high]+ nums[i]== 0) {
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        low++;
                        high--;
                    }

                    else if(nums[low] + nums[high]+ nums[i] > 0 )
                        high--;
                    else
                        low++;
                }
            }

        }

        return result;


    }
}
