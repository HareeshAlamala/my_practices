package com.hackerrank.practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner _in = new Scanner(System.in);
        int size = _in.nextInt();
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = _in.nextInt();
        }
        StringBuilder builder = new StringBuilder();
        for (int index = size-1; index >=0; index--) {
            builder.append(arr[index]+" ");
        }
        System.out.println(builder.toString());
    }
}
