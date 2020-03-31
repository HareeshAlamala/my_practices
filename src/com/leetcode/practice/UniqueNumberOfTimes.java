package com.leetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfTimes {

    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> countMap = new HashMap<>();

        for (int n: arr) {
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }

       return  countMap.values().size() == new HashSet<>(countMap.values()).size();
    }
}
