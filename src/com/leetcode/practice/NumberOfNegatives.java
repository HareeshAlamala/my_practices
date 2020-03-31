package com.leetcode.practice;

public class NumberOfNegatives {

    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;

        int lengthRow = grid.length;

        int lengthCol = grid[0].length;

        int count = 0;

        for (int row = 0; row < lengthRow; row++) {
            for (int col = lengthCol-1; col >=0; col--) {
                if (grid[row][col] < 0)
                    count++;
                else
                    break;
            }
        }

        return count;

    }

}
