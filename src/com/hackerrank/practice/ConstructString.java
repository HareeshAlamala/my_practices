package com.hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class ConstructString {
    public static void main(String[] args) {

    }
    private static int stringConstruction(String s) {

        Set<Character> alphabets = new HashSet<>();

        int cost = 0;

        for (int index = 0; index < s.length(); index++) {

            if(!alphabets.contains(s.charAt(index))) {
                cost++;
                alphabets.add(s.charAt(index));
            }

        }
        return cost;
    }
}
