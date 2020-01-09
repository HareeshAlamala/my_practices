package com.g4g.practice;

import java.util.Scanner;

public class RepetitiveAdditionDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        while (numberOfTestCases--> 0) {
            int number = scanner.nextInt();
            System.out.println(number%9);
        }
    }
}
