package com.leetcode.practice;

public class ReshapeMatrix {

    public static void main(String[] args) {


    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums.length*nums[0].length != r*c)
            return nums;

        int[][] reshapeMatrix = new int[r][c];
        int row = 0;
        int col = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i< nums[0].length; j++) {
                reshapeMatrix[row][col++] = nums[i][j];

                if (col >= c) {
                    row++;
                    col = 0;
                }

            }
        }

        return reshapeMatrix;
    }
}
