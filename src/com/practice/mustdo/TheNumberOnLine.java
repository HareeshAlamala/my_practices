package com.practice.mustdo;

import java.util.Arrays;
import java.util.Scanner;

public class TheNumberOnLine {

    public static void main(String[] args) {

        /* take input*/
        Scanner _in  = new Scanner(System.in);

        int lengthOfLine = _in.nextInt();

        int jarSize  = _in.nextInt();

        int diffPoints = _in.nextInt();

        int[] points = new int[lengthOfLine];

        for (int loop_i = 0; loop_i < lengthOfLine; loop_i++)
            points[loop_i]= _in.nextInt();

        Arrays.sort(points);

        int numberOfJars = 0;

        int eachJar = 1;

        int startIndex = 0;

        for (int index = 1; index <= lengthOfLine; index++) {
            if ((points[index-1] - points[startIndex]) > diffPoints || eachJar > jarSize ) {
                numberOfJars++;
                startIndex = index;
                eachJar = 1;
                continue;
            }

            eachJar++;
        }

        System.out.println(numberOfJars+1);

    }


}
