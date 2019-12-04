package com.hackerrank.practice;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner _in = new Scanner(System.in);
        int numberOfTestCases = _in.nextInt();
        while (numberOfTestCases-- > 0) {
            String givenStr = _in.next();
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();
            boolean flag = false;
            for (int loop_i=0; loop_i < givenStr.length(); loop_i++) {
                if (flag) {
                    oddStr.append(givenStr.charAt(loop_i));
                    flag = false;
                }
                else  {
                    evenStr.append(givenStr.charAt(loop_i));
                    flag = true;
                }

            }

            System.out.println(evenStr.toString()+" "+oddStr.toString());
        }
    }
}
