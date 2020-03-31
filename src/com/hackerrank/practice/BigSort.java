package com.hackerrank.practice;

import java.util.Arrays;

public class BigSort {

    public static void main(String[] args) {

    }

    private static String[] sortBigNumber(String[] unsorted) {

        Arrays.sort(unsorted, (o1,o2) -> {
            if(o1.length() != o2.length() ) {
                return o1.length()-o2.length();
            }

            return o1.compareTo(o2);
        });

        return unsorted;
    }
}
