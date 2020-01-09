package com.leetcode.practice;

public class MinTimeVisitingAllPoints {

    public static void main(String[] args) {

        int[][] arr = {{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(arr));

    }

    public static int minTimeToVisitAllPoints(int[][] points) {

        int totalTime = 0;

        int xPoint = points[0][0];
        int yPoint = points[0][1];
        int xDt = 0;
        int yDt = 0;

        for (int index = 1; index < points.length; index++) {
            xDt = Math.abs(points[index][0] - xPoint);
            yDt = Math.abs(points[index][1] - yPoint);

            if (xDt <= yDt)
                totalTime = totalTime + xDt + (yDt-xDt);
            else
                totalTime = totalTime + yDt + (xDt-yDt);

            xPoint = points[index][0];
            yPoint = points[index][1];
        }

        return totalTime;
    }
}
