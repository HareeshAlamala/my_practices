package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLenOfConcatArray {

    public static void main(String[] args) {

    }

    public int maxLength(List<String> arr) {

        List<String> list = new ArrayList<>();

        for (String str: arr) {

            /* Check if given String has duplicates */
            if (str.length() != getUniqueStringLen(str))
                continue;
            list.add(str);
        }

        arr.clear();

        if (list.size() == 0)
            return -1;
        if (list.size() == 1)
            return list.get(0).length();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                String latestOne = list.get(i) + list.get(j);
                int len = getUniqueStringLen(latestOne);
                while (latestOne.length() == len) {
                    max = Math.max(max,len);
                    latestOne = latestOne+list.get(++j);
                    len = getUniqueStringLen(latestOne);
                }
            }
        }

        return max;

    }

    public int getUniqueStringLen(String str) {

        Set<Character> cache = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            cache.add(str.charAt(i));

        }

        return cache.size();
    }
}
