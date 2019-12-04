package com.hackerearth.practice;

public class CaseConversion {
    public static void main(String[] args) {
    System.out.println(caseConversion("ThisAH"));
    }
    private static String caseConversion(String s) {
        StringBuilder snakeString = new StringBuilder();
        if(s.charAt(0) >= 45 && s.charAt(0) <= 90) {
            snakeString.append(((char) (s.charAt(0) + 'a' - 'A')));
        }else snakeString.append(s.charAt(0));

        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index) >= 45 && s.charAt(index) <= 90) {
                snakeString.append("_"+(char) (s.charAt(index) + 'a' - 'A'));
            } else {
                snakeString.append(s.charAt(index));
            }
        }

        return snakeString.toString();
    }
}
