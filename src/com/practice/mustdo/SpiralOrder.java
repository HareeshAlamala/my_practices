package com.practice.mustdo;

import java.util.Scanner;

public class SpiralOrder {

    public static void main(String[] args) {

        Scanner _in = new Scanner(System.in);

        int numOfTests = _in.nextInt();

        while (numOfTests-- > 0) {

            int rows = _in.nextInt();

            int cols = _in.nextInt();

            char[][] spiralMatrix = new char[rows][cols];

            int length = _in.nextInt();

            String str = _in.next();

            int lengthRow = rows;

            int lengthCol = cols;

            int startRow = 0;

            int startCol = 0;

            int itr;

            int index = 0;


            while (startRow < rows && startCol < cols) {

                for (itr = startCol; itr < cols; ++itr) {
                    spiralMatrix[startRow][itr] = str.charAt(index%length);
                    index++;
                }
                startRow++;
                for (itr = startRow; itr < rows; ++itr) {
                    spiralMatrix[itr][cols-1] = str.charAt(index%length);
                    index++;
                }
                cols--;
                System.out.println("");
                if(startRow < rows) {
                    for (itr = cols-1; itr >= startCol; --itr) {
                        spiralMatrix[rows-1][itr] = str.charAt(index%length);
                        index++;
                    }

                    rows--;
                }
                if (startCol < cols) {
                    for (itr = rows-1; itr >= startRow; --itr) {
                        spiralMatrix[itr][startCol] = str.charAt(index%length);
                        index++;
                    }
                    startCol++;
                }


            }

            for (int i = 0; i < lengthRow; i++) {
                for (int j = 0; j < lengthCol; j++){
                    System.out.print(spiralMatrix[i][j]);
                }
                System.out.println("");
            }
        }

    }
}
