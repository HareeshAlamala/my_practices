package com.hackerearth.practice;

import java.util.Scanner;

public class OneStringNoTrouble {

    public static void main(String[] args) {

        Scanner _sc = new Scanner(System.in);

        String maybeGoodOne = _sc.next();

        int longestSubstring = 0;
        int keepCounting = 0;

        for(int i = 0; i < maybeGoodOne.length()-1; i++) {
            if(maybeGoodOne.charAt(i) != maybeGoodOne.charAt(i+1)) {
                keepCounting++;
            } else {
                keepCounting = 0;
            }

            if (keepCounting > longestSubstring){
                longestSubstring = keepCounting;
            }

        }

        System.out.println(longestSubstring+1);
    }
}
