package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {

    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i: row) {
            for (int j =0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }


        for (int i: col) {
            for (int j =0; j < matrix[0].length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
