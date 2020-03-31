package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
       // System.out.println(isAnagrams("te","eat"));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visit = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visit[i])
                continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (int j = i+1; j < strs.length; j++) {
                if (!visit[j] && isAnagrams(strs[i],strs[j])){
                    list.add(strs[j]);
                    visit[j] = true;
                }
            }
            result.add(list);
        }
        return result;
    }
    public static  boolean isAnagrams(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        short[] chars = new short[26];

        for (int i = 0; i < str1.length(); i++) {
            chars[str1.charAt(i)-'a']++;
            chars[str2.charAt(i)-'a']--;
        }

        for (short i = 0; i < 26; i++){
            if (chars[i] != 0)
                return false;
        }

        return true;
    }
}
