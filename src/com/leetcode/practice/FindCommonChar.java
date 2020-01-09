package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FindCommonChar {

    public static void main(String[] args) {

       String[] str =  {"bella","label","roller"};
        int a = 'a';
        System.out.println(a);
        System.out.println(commonChars(str));
    }
    public static List<String> commonChars(String[] A) {

        List<String> commonStrings = new ArrayList<>();

        int[] CHAR = new int[26];

        Arrays.fill(CHAR, Integer.MAX_VALUE);

        for (String string: A) {

            for (int index = 0; index < string.length(); index++) {
                int[] STR_CHAR_COUNT = new int[26];
                string.chars().forEach(c -> STR_CHAR_COUNT[c-'a']++);

                for (int i =0 ; i < 26; i++)
                    CHAR[i] = Math.min(CHAR[i],STR_CHAR_COUNT[i]);
            }
        }

        for (char ch = 'a'; ch <='z'; ch++)
            while (CHAR[ch-'a']-- > 0)
                commonStrings.add(ch+"");


        return commonStrings;


    }
}
