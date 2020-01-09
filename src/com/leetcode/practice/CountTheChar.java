package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class CountTheChar {

    public static void main(String[] args) {

        //["hello","world","leetcode"]
        //"welldonehoneyr"

        String[] words = {"hello","world","leetcode"};
        System.out.println("--> Count:"+countTheChar(words,"welldonehoneyr"));

    }
    private static int countTheChar(String[] words, String chars) {

        int count = 0;
        for (String word : words) {
            // init Map
            Map<Character, Integer> characterIntegerMap = initMap(chars);

            boolean isAnagram = true;
            System.out.println("--->"+characterIntegerMap);
            for (int index = 0; index < word.length(); index++) {
                System.out.println("Index: "+index+", char: "+word.charAt(index));
                if (characterIntegerMap.get(word.charAt(index)) == null || characterIntegerMap.get(word.charAt(index)) == 0) {
                    System.err.println("--->"+word);
                    isAnagram = false;
                    break;
                }
                else
                    characterIntegerMap.put(word.charAt(index),characterIntegerMap.get(word.charAt(index))-1);

            }
            characterIntegerMap.clear();

            if (isAnagram)
                count += word.length();


        }
        return count;
    }
    private static Map<Character,Integer> initMap(String chars) {

        Map<Character,Integer> initMap = new HashMap<>();

        for (int index = 0; index < chars.length(); index++) {
            initMap.put(chars.charAt(index),initMap.getOrDefault(chars.charAt(index),0)+1);
        }


        return initMap;
    }
}
