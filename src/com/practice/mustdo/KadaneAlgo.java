package com.practice.mustdo;

import java.util.Scanner;

public class KadaneAlgo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        while (numberOfTestCases-- > 0) {

            int size = scanner.nextInt();

            int max_sum_subarray = Integer.MIN_VALUE;

            int max_sum_current_subarray = 0;

            while (size-- >0) {

                max_sum_current_subarray += scanner.nextInt();

                if (max_sum_current_subarray > max_sum_subarray)
                    max_sum_subarray = max_sum_current_subarray;

                if (max_sum_current_subarray < 0)
                    max_sum_current_subarray = 0;

            }

            System.out.println(max_sum_subarray);
        }
    }
}
