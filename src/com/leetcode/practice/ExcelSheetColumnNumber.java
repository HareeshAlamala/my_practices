package com.leetcode.practice;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

    }
    private static int titleToNumber(String s) {
        int multiplyFactor = 1;
        int columnNumber = 0;
        for (int loop_i = s.length()-1; loop_i >= 0; loop_i--){
            int value = 'A' - s.charAt(loop_i)+1;
            columnNumber += value*multiplyFactor;
            multiplyFactor = multiplyFactor*26;
        }
        return columnNumber;
    }
}
