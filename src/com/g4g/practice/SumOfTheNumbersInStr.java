package com.g4g.practice;

import java.util.Scanner;

public class SumOfTheNumbersInStr {

    public static void main(String[] args) {

        Scanner _in = new Scanner(System.in);
        int numberOfTestCases = _in.nextInt();
        while (numberOfTestCases-->0) {
            int sum = 0;
            String str = _in.next();
            StringBuilder num = new StringBuilder();
            for (int index = 0; index < str.length(); index++) {
                if(str.charAt(index) >=48 && str.charAt(index) <=57) {
                    num.append(str.charAt(index));
                } else if(num.length() >0){
                    sum += Integer.parseInt(num.toString());
                   // System.out.println("Intermediate Sum:"+sum);
                    num.delete(0,num.length());
                }
            }
            if(num.length() >0)
                sum += Integer.parseInt(num.toString());

            System.out.println(sum);
        }
    }
}
