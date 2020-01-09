package com.interviewBit;

import java.util.Arrays;
import java.util.List;

public class MaxSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, -10};
        System.out.println(subArray(Arrays.asList(-163,-20)));

    }

    private static int subArray(List<Integer> A) {

        int max_sum = A.get(0);

        int max_current_sum = A.get(0);

        for (int index = 1; index < A.size(); index++) {

            max_current_sum = Math.max(max_current_sum, max_current_sum+ A.get(index));
            max_sum = Math.max(max_current_sum,max_sum);

        }

        return max_sum;
    }
}
