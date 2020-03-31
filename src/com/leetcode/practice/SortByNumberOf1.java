package com.leetcode.practice;

import java.util.*;

public class SortByNumberOf1 {

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,17,19};
        System.out.println(sortByBits(arr));
    }

    public static int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int in: arr)
            list.add(in);

        Collections.sort(list, (o1, o2) -> countOnes(o1).compareTo(countOnes(o2)));

        for (int index = 0; index < list.size(); index++)
            arr[index] = list.get(index);
        return arr;
    }

    public static Integer countOnes(Integer n) {
        return Integer.bitCount(n);
    }
}
