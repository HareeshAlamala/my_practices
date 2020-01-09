package com.hackerearth.practice;

import java.util.Scanner;

public class MonkAndRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        StringBuilder builder = new StringBuilder();

        while (numberOfTestCases-->0) {

            int size = scanner.nextInt();

            int numberOfRotaions = scanner.nextInt();

            int[] arr = new int[size];

            for (int index=0; index < size; index++) {
                arr[index] = scanner.nextInt();
            }

            numberOfRotaions = numberOfRotaions%size;

            for (int index = 0; index < size; index++) {
                builder.append(arr[(index+size-numberOfRotaions)%size]+" ");
            }
            builder.append("\n");
        }

        System.out.print(builder.toString());
    }
}
