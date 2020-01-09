package com.leetcode.practice;

public class CellWithOddValues {

    public static void main(String[] args) {

        int n = 2;
        int m = 2;
        int[][] indices= {{1,1},{0,0}};
        System.out.println(oddCells(n,m,indices));

    }

    private static int oddCells(int n, int m, int[][] indices) {

        int numberOfOddCells = 0;

        int[][] arr = new int[n][m];

        for (int index = 0; index < indices.length; index++) {
            increamentRow(arr,indices[index][0],m);
            increamentColumn(arr,indices[index][1],n);
        }

        for (int i =0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if ((arr[i][j] & 1) != 0)
                   numberOfOddCells++;
            }
        }

        return numberOfOddCells;

    }

    private static void increamentRow(int[][] arr, int row, int numberOfColumns) {
        for (int index = 0; index < numberOfColumns; index++)
            arr[row][index]++;
    }
    private static void increamentColumn(int[][] arr, int column, int numberOfRows) {
        for (int index = 0; index < numberOfRows; index++)
            arr[index][column]++;
    }

}
