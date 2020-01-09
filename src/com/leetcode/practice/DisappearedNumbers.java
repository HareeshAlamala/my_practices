package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index< nums.length;index++) {

            int index_val = nums[index] - 1;

            if (index_val > 0)
                nums[index_val] = -nums[index_val];

        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                result.add(index+1);
            }
        }

        return result;


    }
}
