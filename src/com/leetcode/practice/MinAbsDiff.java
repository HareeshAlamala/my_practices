package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff {

    public static void main(String[] args) {

        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println("-->"+minimumAbsDifference(arr));

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        /* Find minimum element */
        int minDiff = Integer.MAX_VALUE;

        for (int index = 0; index < arr.length-1; index++) {

            if (minDiff > (arr[index+1] - arr[index]) )
                minDiff = arr[index+1] - arr[index];
        }

        for (int index = 0; index < arr.length-1; index++) {
            if(minDiff == (arr[index+1] - arr[index])) {
                result.add(Arrays.asList(arr[index],arr[index+1]));
            }
        }

        return  result;
    }
}
