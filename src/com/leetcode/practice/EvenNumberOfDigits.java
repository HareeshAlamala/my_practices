package com.leetcode.practice;

public class EvenNumberOfDigits {

    public static void main(String[] args) {

    }

    public static int findNumbers(int[] nums) {

        int evenNumOfDigitsCount = 0;

        for (int number: nums) {
            if (hasEvenNumberOfDigits(number))
                evenNumOfDigitsCount++;
        }

        return evenNumOfDigitsCount;
    }

    private static boolean hasEvenNumberOfDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number = number/10;
        }

        return (count & 1) == 0;
    }
}
