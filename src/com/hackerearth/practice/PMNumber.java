package com.hackerearth.practice;

import java.util.Scanner;

public class PMNumber {

	public static void main(String[] args) {
		
		Scanner _in = new Scanner(System.in);
		
		int number_a =_in.nextInt();
		
		int number_b = _in.nextInt();
		
		for(int i = number_a ; i <= number_b ; i++ ) {
			if(isPrime(i) && isPrime(addDigits(i))) {
				System.out.println(i);
			}
		}
		

	}
	
	private static int addDigits(int N) {
		if(N < 10 ) return N;
		
		int digitSum = 0;
		
		while(N != 0 ) {
			int r = N%10;
			digitSum = digitSum + r;
			N  = N/10;
		}
		
		
		return digitSum;
	}

	
	private  static boolean isPrime(int N)    { 
	       
	        if (N <= 1) 
	            return false; 
	        
	        if (N <= 3) 
	            return true; 	  
	        
	        if (N % 2 == 0 || N % 3 == 0) 
	            return false; 
	  
	        for (int i = 5; i * i <= N; i = i + 6) 
	            if (N % i == 0 || N % (i + 2) == 0) 
	                return false;
	  
	        return true; 
	    } 
	
	

}
