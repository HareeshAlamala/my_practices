package com.leetcode.practice;

public class ValidAnagram {

    public static void main(String[] args) {


    }
    private  static  boolean isValidAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] alphabets = new int[26];
        int[] alphabets2 = new int[26];

        for(int loop_i = 0; loop_i < t.length(); loop_i++) {
            alphabets[t.charAt(loop_i)-'a']++;
            alphabets2[s.charAt(loop_i)-'a']++;
        }

        for (int loop_j = 0; loop_j < 26; loop_j++) {
            if (alphabets[loop_j] != alphabets2[loop_j] )
                return false;
        }

        return true;

    }
}
