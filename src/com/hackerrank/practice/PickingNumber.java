package com.hackerrank.practice;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PickingNumber {
    public static void main(String[] args) {

    }
    private static int pickingNumbers(List<Integer> a) {

        Map<Integer,Long> groupByElements = a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Long maxSubArr = 0L;
        for (int i = 2; i < 100; i++) {
           maxSubArr = Math.max(maxSubArr,groupByElements.getOrDefault(i,0L)+groupByElements.getOrDefault(i-1,0L));
        }

        return maxSubArr.intValue();
    }
}
