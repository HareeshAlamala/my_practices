package com.hackerearth.practice;

import java.util.Scanner;

public class BobAndBomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        while(numberOfTestCases-->0) {
            String givenStr = scanner.next();
            int count = 0;
            for (int i = 0; i < givenStr.length(); i++) {

                if ((givenStr.charAt(i) == 'W') && ((i > 0 && givenStr.charAt(i-1)=='B')
                    || (i > 1 && givenStr.charAt(i-2) == 'B') || (i < givenStr.length() && givenStr.charAt(i + 1)=='B')
                        || (i < givenStr.length()-2 && givenStr.charAt(i + 2)=='B')))
                    count++;

            }
            System.out.println(count);
        }
    }

}
