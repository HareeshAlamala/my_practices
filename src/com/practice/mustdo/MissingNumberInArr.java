package com.practice.mustdo;

import java.util.Scanner;

public class MissingNumberInArr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        while (numberOfTestCases-- > 0) {

            int size = scanner.nextInt();

            int x1 = scanner.nextInt();
            int x2 = 1;

            for (int i = 1; i < size-1; i++) {
                x1 ^= scanner.nextInt();
            }

            for (int i = 2; i <=size; i++)
                x2 ^=i;

            System.out.println(x1^x2);

            /* Approach 2: Sum all index from 1 to n+1 and remove elements of arr[index-2]*/
        }
    }
}
