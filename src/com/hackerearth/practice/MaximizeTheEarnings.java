package com.hackerearth.practice;

import java.util.Scanner;

public class MaximizeTheEarnings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStreets = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        while (numberOfStreets-->0) {

            int numberOfBuilding = scanner.nextInt();

            int earningRate = scanner.nextInt();

            int visibleBuildings = 0;

            int maxHeight = 0;

            while (numberOfBuilding-->0) {
                int buidingHeight = scanner.nextInt();
                if(buidingHeight > maxHeight){
                    maxHeight = buidingHeight;
                    visibleBuildings++;
                }
            }
            /**
             * Time Limit exceeding for last test  case
             */
            result.append(visibleBuildings*earningRate+"\n");

        }

        System.out.print(result.toString());
    }
}
