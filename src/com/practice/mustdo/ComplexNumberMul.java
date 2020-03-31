package com.practice.mustdo;

import java.util.Scanner;

public class ComplexNumberMul {

    public static void main(String[] args) {

        Scanner _in = new Scanner(System.in);

        int testCases = _in.nextInt();

        while (testCases-- > 0) {

            int numberOfComplexNumbers = _in.nextInt();

            long real = 0;

            long img = 0;

            boolean flag = true;

            while (numberOfComplexNumbers--> 0) {

                int x = _in.nextInt();
                int y = _in.nextInt();

                if (flag) {
                    flag = false;
                    real = x;
                    img = y;
                    continue;
                }
                long t = real;
                real = real*x- img*y;
                img = y*t + x*img;
            }

            System.out.println(real+" "+img);
        }
    }
}
