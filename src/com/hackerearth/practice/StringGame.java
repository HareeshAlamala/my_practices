package com.hackerearth.practice;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        while (numberOfTestCases-- > 0) {
            String gameString = scanner.next();
            boolean[] alphabets = new boolean[26];
            boolean nextChanceP1 = true;
            boolean p1 = true;
            for( int index =0; index < gameString.length(); index++) {
                if(alphabets[gameString.charAt(index)-'a']){
                }else {
                    alphabets[gameString.charAt(index)-'a'] = true;
                    if(!nextChanceP1) {
                        p1 = false;
                    } else
                    p1 = true;

                    nextChanceP1 = !nextChanceP1;
                }
            }
            if (p1)
            System.out.println("Player 1");
            else System.out.println("Player 2");
        }
    }
}
