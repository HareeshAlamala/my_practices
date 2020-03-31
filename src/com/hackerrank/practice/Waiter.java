package com.hackerrank.practice;

import java.util.Arrays;

public class Waiter {

    public static void main(String[] args) {

    }

    static int[] waiter(int[] number, int q) {

        int[] primeMat = primeNumbers(9800);

        int[] result = new int[number.length];

        int[] stackB = new int[number.length];

        int top = number.length-1;

        int topB = -1;

        int itr = 1;
        while (itr++ <= q) {

            int prime = primeMat[itr-1];

            while (top >= 0 ) {

                if (number[top] > 0 && number[top]%prime == 0) {

                    stackB[++topB] = number[top];

                    number[top] = -1;

                }
                top--;
            }

            top = number.length-1;

        }
        int index = 0;
        for (int i = topB; i >= 0; i--) {
            result[index++] = stackB[i];
        }

        // add A stack
        for (int i = number.length-1; i >= 0; i--) {
            if (number[i] > 0)
                result[index++] = number[i];
        }

        return result;

    }

    static int[] primeNumbers(int N) {

        boolean[] calPrime = new boolean[N+1];

        Arrays.fill(calPrime,true);


        for (int itr = 2; itr*itr <= N; itr++) {
            if (calPrime[itr]) {

                for (int mul = itr*itr; mul <=N; mul += itr)
                    calPrime[mul] = false;
            }
        }

        int[] primNumbers = new int[N];
        int c = 0;
        for (int i = 0; i< N; i++) {
            if (calPrime[i]) {
               primNumbers[c++] =  i;
            }
        }

        return primNumbers;

    }
}
