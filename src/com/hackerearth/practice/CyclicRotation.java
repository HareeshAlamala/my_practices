package com.hackerearth.practice;

import java.util.Scanner;

public class CyclicRotation {
    public static void main(String[] args) {
        Scanner _in = new Scanner(System.in);
        int numberOfTestCases = _in.nextInt();
        while (numberOfTestCases-- > 0) {
            String givenStr = _in.next();
            long length = givenStr.length();
            System.out.println(length*(length+1)/2);
        }
    }
}
