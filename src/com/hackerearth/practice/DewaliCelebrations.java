package com.hackerearth.practice;

import java.util.Scanner;

public class DewaliCelebrations {
    public static void main(String[] args) {
        Scanner _in = new Scanner(System.in);
        int numberOfTestCases = _in.nextInt();
        while (numberOfTestCases-- > 0) {
            int initialCoins = _in.nextInt();
            int eachDayCoins = _in.nextInt();
            int days = _in.nextInt()-1;
            System.out.println(initialCoins+eachDayCoins*days);
        }
    }
}
