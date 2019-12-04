/**
 * 
 */
package com.leetcode.practice;

import java.util.Scanner;

/**
 * @author ahareesh
 *
 */
public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner _in = new Scanner(System.in);
		
		int x = _in.nextInt();
		
		int y = _in.nextInt();
		

		int count = 0;
		
		System.out.println("Offset .. "+(x^y));
		while (x > 0 && y > 0) {
			if (x % 2 != y % 2)
				count++;
			x /= 2;
			y /= 2;
		}
		// if either x or y is still not 0 then
		// get its bit count as only these bits will be
		// different in x and y
		System.out.println("=====>"+count);
		if (x > 0)
			count += Integer.bitCount(x);
		if (y > 0)
			count += Integer.bitCount(y);
		System.out.println("Offset .. "+(x^y));
		System.out.println( count);
		
		// return Integer.bitCount(x^y);
	}

}
