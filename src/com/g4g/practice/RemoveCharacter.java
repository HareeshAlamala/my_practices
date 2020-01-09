package com.g4g.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        while(numberOfTestCases--> 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            Map<Character,Character> characterMap = new HashMap<>();
            for (int index = 0; index < s2.length();index++) {
                characterMap.put(s2.charAt(index),s2.charAt(index));
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int index=0;index< s1.length(); index++) {
                if (characterMap.get(s1.charAt(index)) == null)
                    stringBuilder.append(s1.charAt(index));
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
