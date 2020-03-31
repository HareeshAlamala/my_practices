package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeyboardRow {

    int[] ROW =  {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};

    public static void main(String[] args) {

    }
    public String[] findWords(String[] words) {

       int index = 0;

       String[] result = new String[words.length];

       for (String str: words) {
            if (checkRow(str.toLowerCase())) {
                result[index++] = str;
            }
       }

       return Arrays.copyOf(result,index-1);
    }

    public boolean checkRow(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (ROW[str.charAt(0)-'a'] != ROW[str.charAt(i)])
                return false;
        }
        return true;
    }
}
