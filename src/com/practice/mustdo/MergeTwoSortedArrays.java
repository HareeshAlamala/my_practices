package com.practice.mustdo;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        StringBuilder builder = new StringBuilder();

        while (numberOfTestCases--> 0) {

            int sizeOfArr1 = scanner.nextInt();

            int[] arr1 = new int[sizeOfArr1];

            int sizeOfArr2 = scanner.nextInt();

            int[] arr2 = new int[sizeOfArr2];

            for (int index = 0; index < sizeOfArr1; index++) {
                arr1[index] = scanner.nextInt();
            }

            for (int index = 0; index < sizeOfArr2; index++) {
                arr2[index] = scanner.nextInt();
            }

            int arr1_index = 0;

            int arr2_index = 0;

            for (;arr1_index< sizeOfArr1;) {

                if(arr2_index < sizeOfArr2 && arr1[arr1_index] <= arr2[arr2_index]) {
                    builder.append(arr1[arr1_index++]+" ");
                } else if (arr2_index < sizeOfArr2 && arr1[arr1_index] > arr2[arr2_index]) {
                    builder.append(arr2[arr2_index++]+" ");
                } else {
                    builder.append(arr1[arr1_index++]+" ");
                }
            }

            if (sizeOfArr1 < sizeOfArr2) {
                while (arr2_index < sizeOfArr2) {
                    builder.append(arr2[arr2_index++]+" ");
                }
            }

            builder.append("\n");


        }

        System.out.println(builder.toString());
    }
}
