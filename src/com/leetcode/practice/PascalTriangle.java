package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.print(new PascalTriangle().generate(4));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        result.add(list1);
        if (numRows == 1) {
            return result;
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        result.add(list2);
        if (numRows == 2) {
            return result;
        }

        int level = 3;

        for (int i = level; i <= numRows; i++) {

            List<Integer> list = new ArrayList<>(i);
            list.add(1);
            for (int j = 1; j < (i-1); j++) {
                list.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
            }
            list.add(1);
            result.add(list);
        }

        return result;
    }
}
