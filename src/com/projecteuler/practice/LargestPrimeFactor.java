/**
 * 
 */
package com.projecteuler.practice;

/**
 * @author ahareesh
 *
 */
public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long N = 600851475143L;
		
		int maxPrimeFactor = -1;
		
		while(N%2 == 0) {
			N >>=1;
			maxPrimeFactor = 2;
		}
		int i = 3;
		while(i <= Math.sqrt(N)) {
			while(N%i==0) {
				maxPrimeFactor = i;
				N /= i;
			}
			i +=2;
		}
		
		if (N == 1)
			System.out.println(maxPrimeFactor);
		else
			System.out.println(N);
		
		

	}

}
