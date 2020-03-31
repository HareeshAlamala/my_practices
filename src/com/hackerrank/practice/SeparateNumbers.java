package com.hackerrank.practice;

import java.util.Arrays;

public class SeparateNumbers {

    public static void main(String[] args) {
        separateNumbers("10111213");
    }

    static void separateNumbers(String s) {


        // handle boundary conditions
        if (s == null || s.length() == 0 || s.length() > 32) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i < s.length() / 2; i++) {

            long number = Long.valueOf(s.substring(0, i));
            long startNumber = number;

            // form number
            StringBuilder sb = new StringBuilder(s.length());

            while (sb.length() < s.length()) {
                sb.append(number++);
            }

            if (sb.toString().equals(s)) {
                System.out.println("YES "+startNumber );
                return;
            }

        }
        System.out.println("NO");
    }
}
