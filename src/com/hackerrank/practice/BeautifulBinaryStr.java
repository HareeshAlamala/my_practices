package com.hackerrank.practice;

public class BeautifulBinaryStr {

    public static void main(String[] args) {

    }
    private static  int beautifulBinaryString(String b) {
        int count = 0;
        StringBuilder builder = new StringBuilder(b);
        while(builder.indexOf("010") != -1) {
            int index = builder.indexOf("010");
            builder.replace(index+2,index+3,"1");
            count++;
        }
        return count;
    }
}
