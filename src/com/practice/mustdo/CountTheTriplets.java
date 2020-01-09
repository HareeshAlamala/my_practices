package com.practice.mustdo;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheTriplets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases--> 0) {

            int size = scanner.nextInt();

            int[] arr = new int[size];

            int maxElement = 0;

            for (int index = 0; index < size; index++) {
                arr[index] = scanner.nextInt();
                maxElement = (maxElement < arr[index])?arr[index]:maxElement;
            }

            /* Approach : 1
                Sort array elements and find triplets by iterating
             */
            Arrays.sort(arr);

            for (int index = 0; index < size; index++) {
                //TODO
            }
        }
    }
}
