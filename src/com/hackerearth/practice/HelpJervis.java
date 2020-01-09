package com.hackerearth.practice;

import java.util.Arrays;
import java.util.Scanner;

public class HelpJervis {
    /**
     * Problem Statement: Help Jarvis write a program for hulk to decide whether collected coaches will move or not.
     */
    public static void main(String[] args) {

        Scanner _in = new Scanner(System.in);

        int numberOfTestCases = _in.nextInt();
        StringBuilder result = new StringBuilder();
        while (numberOfTestCases--> 0) {
            String numberStr = _in.next();
            char[] charNumbers = numberStr.toCharArray();
            Arrays.sort(charNumbers);
            boolean flag = false;
            for (int index = 1; index < charNumbers.length; index++) {
                if(charNumbers[index]-charNumbers[index-1] != 1){
                    result.append("NO \n");
                    flag = true;
                    break;
                }
            }

            if (!flag)
                result.append("YES \n");



        }

        System.out.print(result.toString());

    }
}
