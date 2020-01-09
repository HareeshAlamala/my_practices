package com.g4g.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TwiceCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        while (numberOfTestCases-->0) {
            int size = scanner.nextInt();
            Map<String,Integer> stringIntegerMap = new HashMap<>();
            while (size-->0) {
                String string = scanner.next();
                stringIntegerMap.put(string,stringIntegerMap.getOrDefault(string,0)+1);
            }

            System.out.println(stringIntegerMap.values().stream().filter(v-> v==2).collect(Collectors.counting()));

        }
    }
}
