package com.leetcode.practice;

import java.util.*;

public class LargestNumDivByThree {

    public String largestMultipleOfThree(int[] digits) {
        Set<Integer> cache = new HashSet<>(digits.length);
        Arrays.sort(digits);
        int reminder = 0;
        for (int i = 0; i <digits.length; i++) {
            cache.add(digits[i]);
            reminder += digits[i]%3;

            reminder += reminder%3;
        }

        if (cache.contains(reminder)){
            StringBuilder res = new StringBuilder();
            for (int i = digits.length-1; i>=0; i--) {
                if (digits[i]!= reminder){
                    res.append(digits[i]);
                }
            }

            Queue<Integer> q = new LinkedList<>();

            return res.toString();

        } else
            return "";



    }
}
