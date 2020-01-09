package com.hackerrank.practice;

public class KaprekarNumber {

    public static void main(String[] args) {
       kaprekarNumbers(10,40);
    }

    static void kaprekarNumbers(int p, int q) {

        StringBuilder builder = new StringBuilder();

        for (int start = p; start <= q; start++) {
            if (isKaprekarNumber(start)){
                builder.append(start+"\n");
            }

        }

        if (builder.length() == 0){
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(builder.toString());
        }

    }
    private static boolean isKaprekarNumber(int number) {

        String intStr = String.valueOf((long) number * number);
        String leftStr = intStr.substring(0,intStr.length()/2);
        String rightStr = intStr.substring(intStr.length()/2);
        int leftValue = leftStr.isEmpty()?0:Integer.parseInt(leftStr);
        int rightValue = rightStr.isEmpty()?0:Integer.parseInt(rightStr);
        return ((leftValue + rightValue) == number);
    }
}
