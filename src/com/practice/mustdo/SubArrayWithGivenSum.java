package com.practice.mustdo;

import java.util.Scanner;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        while (numberOfTestCases-- > 0) {

            int size = scanner.nextInt();

            int sum = scanner.nextInt();

            int[] arr = new int[size];

            for (int index = 0; index < size; index++)
                arr[index] = scanner.nextInt();

            int slow_index = 0;

            int subArraySum = 0;

            boolean flag = false;

            for (int index = 0; index <size; index++) {

                subArraySum += arr[index];

                while (subArraySum > sum)
                    subArraySum -= arr[slow_index++];

                if (subArraySum == sum ) {
                    result.append(slow_index+1+" "+(index+1)+"\n");
                    flag = true;
                    break;
                }

            }


            if (!flag)
                result.append("-1\n");
        }

        System.out.println(result.toString());
    }
}
