package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueChar {

    public static void main(String[] args) {

    }
    private static int firstUniqChar(String s) {

        short[] alphabets = new short[26];
        for (int loop_i = 0; loop_i < s.length(); loop_i++) {
            alphabets['a'-s.charAt(loop_i)]++;
        }

        for (int loop_j = 0; loop_j < s.length(); loop_j++) {
            if (alphabets['a'-s.charAt(loop_j)] == 0)
                return loop_j;
        }

        return 0;
    }
}
