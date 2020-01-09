package com.hackerearth.practice;

import java.util.Scanner;

public class LongATMQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int grpCount = 1;

        int prevValue = -1;

        while (size--> 0) {
            int personHeight = scanner.nextInt();
            if(personHeight < prevValue)
                grpCount++;
            prevValue = personHeight;
        }

        System.out.println(grpCount);
    }
}
