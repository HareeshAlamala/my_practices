package com.hackerrank.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibFine {
    public static void main(String[] args) {

        System.out.println(libraryFine(2 ,7, 1014,1,1,1014));
    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        /* check year */
        if (y1 > y2)
            return 10000;
        else if (y1 < y2)
            return 0;
        /* check month since year is same */

        if (m1 > m2 )
            return 500*(m1-m2);
        else if (m1 < m2 )
            return 0;

        /*check date */
        if (d1 <= d2)
            return 0;
        else return (d1-d2)*15;

    }
}
