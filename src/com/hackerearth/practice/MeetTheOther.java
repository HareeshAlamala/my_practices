package com.hackerearth.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeetTheOther {
    /**
     * Problem Statement: Find the minimum distance B/W two String which are equal
     */
    public static void main(String[] args) {

        Scanner _in = new Scanner(System.in);
        int numberOfTestCases = _in.nextInt();
        StringBuilder result = new StringBuilder();
        while (numberOfTestCases--> 0) {
            int size = _in.nextInt();
            int minimumDistance = Integer.MAX_VALUE;
            Map<String,Integer> stringIntegerMap = new HashMap<>();
            for (int index = 0; index < size; index++) {
                String str = _in.next();
                if( stringIntegerMap.get(str) == null)
                    stringIntegerMap.put(str,index);
                else {
                    int i = stringIntegerMap.get(str);
                    minimumDistance = ((index-i) < minimumDistance)?(index-i):minimumDistance;
                    stringIntegerMap.put(str,index);
                }

            }
            if (minimumDistance == Integer.MAX_VALUE)
                minimumDistance = -1;
            result.append(minimumDistance+"\n");
        }
        System.out.print(result.toString());
    }

}
