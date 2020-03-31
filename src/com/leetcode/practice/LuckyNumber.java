package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {

    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> op = new ArrayList<>();

        if (matrix == null || matrix.length ==0 )
            return op;


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++){

                if (rowMin(matrix,row) == colMax(matrix,col)) {
                    op.add(matrix[row][col]);
                    break;
                }
            }
        }

        return op;


    }

    private int colMax(int[][] matrix, int col) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(max,matrix[i][col]);
        }

        return max;
    }

    private int rowMin(int[][] matrix, int row) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix[0].length; i++) {
            min = Math.min(min,matrix[row][i]);
        }

        return min;
    }
}
