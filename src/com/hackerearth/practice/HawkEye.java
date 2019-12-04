package com.hackerearth.practice;

import java.util.Scanner;

public class HawkEye {
	
	public static void main(String[] args) {
		
		Scanner _in =  new Scanner(System.in);
		
		/*int N = _in.nextInt();
		
		int index_i = _in.nextInt();
		
		int index_j = _in.nextInt();
		
		int power  = _in.nextInt();*/
		
		int N = 9;
		int index_i = 2;
		int index_j = 2;
		int power = 20;
		int[][] board = new int[N][N];
		
		
		if(index_i == index_j) {
			board[index_i][index_j] = power;
			
			
			
			
			int i = index_i-1;
			int j = index_j +1;
			int diff = j-i+1;
			/*while(power-- > 0 ) {
				System.out.println("-----i1,j1--"+i+", "+j);
				for(int k = i; k < j; k++) {
					board[i][k] = power;
				}
				System.out.println("-----i2--"+i+", "+j);
				for(int k = i; k < j; k++) {
					board[k][j] = power;
				}
				for(int k = i; k <j; k++) {
					board[k][i] = power;
				}
				for(int k = i; k <=j; k++) {
					board[j][k] = power;
				}
				
				i--;
				j++;
				diff = diff-1;
			}*/
			
			
		}
		else {
			
		}
		
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j < N; j++) {
				board[i][j] = (power - Math.max(Math.abs(index_i-i), Math.abs(index_j-j))) > 0 ? power - Math.max(Math.abs(index_i-i), Math.abs(index_j-i)) : 0;
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
