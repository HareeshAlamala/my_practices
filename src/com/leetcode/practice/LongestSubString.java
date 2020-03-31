package com.leetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(longestSubStringNoRepeat("caaaabcd"));
    }

    public static int longestSubStringNoRepeat(String s) {

        if (s == null || s.length()==0)
            return 0;
        if (s.length() == 1)
            return 1;

        Set<Character> chars = new HashSet<>();

        int start = 0;

        int end = start+1;

        int maxSize = 0;

        chars.add(s.charAt(0));

        for (; start < s.length() && end < s.length(); ) {

            if (chars.contains(s.charAt(end))) {
                maxSize = Math.max(maxSize, end-start);
                start++;
                end = start+1;
                chars.clear();
                chars.add(s.charAt(start));
            } else {
                chars.add(s.charAt(end++));
            }

            if (end == s.length()){
                maxSize = Math.max(maxSize, end-start);
                start++;
                end = start +1;
            }
        }

        return Math.max(maxSize, end-start);
    }
}
