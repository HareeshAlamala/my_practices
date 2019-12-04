/**
 * 
 */
package com.hackerrank.practice;

import java.util.Scanner;

/**
 * @author Hareesh Alamala
 *
 */
public class BreakingTheRecord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner _in = new Scanner(System.in);
		
		int numberOfGames = _in.nextInt();
		
		int[] scoreBoard = new int[numberOfGames];
		
		for(int i = 0; i < numberOfGames; i++) {
			scoreBoard[i] = _in.nextInt();
		}
		
		breakingRecords(scoreBoard);

	}
	/**
	 * This can be implemented in several ways; Tree approach, Multiple variable approach
	 * 
	 * @param scores
	 * @return
	 */
	private static int[] breakingRecords(int[] scores) {
		int[] scoreMinMix = new int[2];
		
		int scoreMin = scores[0];
		int scoreMax = scores[0];
		int maxCount = 0;
		int minCount = 0;
		
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > scoreMax) {
				maxCount++;
				scoreMax = scores[i];
			}
			
			if(scores[i] < scoreMin) {
				minCount++;
				scoreMin = scores[i];
			}
		}
		
		scoreMinMix[0] = maxCount;
		scoreMinMix[1] = minCount;
		
		System.err.println("Max Breaking: "+maxCount+", Min Breaking: "+minCount);
		
		return scoreMinMix;
	}

}
