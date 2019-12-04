package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

    System.out.println(romanToInt("IXIX"));
    }

    private static int romanToInt(String s) {
        Map<Character,Integer> decimalValue = new HashMap<>();
        decimalValue.put('I',1);
        decimalValue.put('V',5);
        decimalValue.put('X',10);
        decimalValue.put('L',50);
        decimalValue.put('C',100);
        decimalValue.put('D',500);
        decimalValue.put('M',1000);

        int count = 0;
        for (int index = 0; index < s.length(); index++) {
            int currentValue = decimalValue.get(s.charAt(index));
            if(index+1 <s.length()){
                int nextValue =decimalValue.get(s.charAt(index+1));
                if(currentValue >= nextValue)
                    count += currentValue ;
                else {
                    count += nextValue - currentValue;
                    index++;
                }
            } else {
                count += currentValue ;
               // index++;
            }


        }

        return count;
    }
}
