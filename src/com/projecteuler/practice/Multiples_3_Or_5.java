/**
 * 
 */
package com.projecteuler.practice;

/**
 * @author ahareesh
 * @version base version
 */
public class Multiples_3_Or_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int MAX_LIMIT = 1000;
		long sumOfMultiple = 0;
		for(int i = 1; i< MAX_LIMIT; i++) {
			
			if(i%3==0 || i%5 == 0)
				sumOfMultiple+=i;
				
		}

		System.out.println(sumOfMultiple);
	}

}
