/**
 * 
 */
package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Hareesh Alamala
 *
 */
public class BirthdayChocoBar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner _in = new Scanner(System.in);
		
		int numberOfSqueres = _in.nextInt();
		
		List<Integer> chocoSqueres = new ArrayList<>();
		
		for(int i = 0 ; i < numberOfSqueres; i++) {
			chocoSqueres.add(_in.nextInt());
		}
		
		int day = _in.nextInt();
		int month = _in.nextInt();
		
		System.out.println(birthdayChocolate(chocoSqueres, day, month));

	}
	private static int birthdayChocolate(List<Integer> s, int d, int m) {
		int count = 0;
		for(int i = 0; i < s.size(); i++) {
			int temp = 1;
			int sum = s.get(i);
			while(temp < m && s.size() > (temp+i)) {
				System.err.println("Sum At "+i+", SUM:"+sum);
				sum += s.get(i+temp);
				temp++;
				
			}
			
			System.err.println("------SUM------ At:"+i+". SUM: "+sum);
			if(sum == d) {
				count++;
			}
		}
		
		return count;
	}

}
