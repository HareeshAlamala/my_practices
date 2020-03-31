package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compress {

    public static void main(String[] args) {

        char[] chars = {'a','a','b','c','c'};

        /*int len = compression(chars);

        for (int i = 0; i < len; i++) {
            System.out.print(chars[i]+"->");
        }*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println(repeatedNumber(list));
    }

    public static int compression(char[] chars) {

        if(chars.length == 1) return 1;

        int refIndex = 0;

        int tempCount = 1;

        int result = 0;

        for (int index = 1; index < chars.length; index++) {

            if (chars[index-1] == chars[index]) {
                tempCount++;
            } else {
                chars[refIndex++] = chars[index-1];
                if( tempCount != 1) {
                    String n = ""+tempCount;
                    for (int i = 0; i < n.length(); i++)
                        chars[refIndex++] = n.charAt(i);
                    result += n.length() +1;
                }

                tempCount = 1;
            }
        }
        // handle last consecutive chars

        if (tempCount > 0) {
            chars[refIndex++] = chars[chars.length-1];
            if( tempCount != 1) {
                String n = ""+tempCount;
                for (int i = 0; i < n.length(); i++)
                    chars[refIndex++] = n.charAt(i);
                result += n.length() +1;
            }
        }

        return refIndex;
    }

    public static  ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        Collections.sort(A);


        int duplicateNumber = 0;
        int missingNumber = 0;
        int startNumber = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            startNumber++;
            if(A.get(i) == A.get(i-1))
                duplicateNumber = A.get(i);

            if(A.get(i) != startNumber)
                missingNumber = startNumber;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicateNumber);
        result.add(missingNumber);
        return result;
    }
}
