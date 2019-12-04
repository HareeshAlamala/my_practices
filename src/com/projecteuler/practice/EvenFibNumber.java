/**
 * 
 */
package com.projecteuler.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.nio.cs.ext.ISCII91;

/**
 * @author ahareesh
 *
 */
public class EvenFibNumber {

	private static final int MAX_LIMIT = 40; 
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String A = "welcometojava";
		String B = "apple";
		int k = 3;
		System.out.println(A.length()+A.length());
		if(A.compareTo(B) < 0 )
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) +" "+B.substring(0, 1).toUpperCase() + B.substring(1));
		
		String largest = "";
		String smallest = "";
		for(int i = 0; i< A.length()-k+1; i++) {
			if(smallest.compareTo(A.substring(i,i+k)) > 0 ) {
				smallest = A.substring(i, i+3);
			}
			System.err.println("Sub String :"+A.substring(i, i+3));
			if(largest.compareTo(A.substring(i,i+k)) < 0 ) {
				largest = A.substring(i, i+3);
			}
		}
		
		System.out.println(smallest+"---"+largest);
		
		
		String a = "madam";
		String b = "amadm";
		b = b.toUpperCase();
		a = a.toUpperCase();
		int[] chars = new int[26];
		int[] arr = new int[26];
		if(a.length() != b.length())
			System.out.println("Not Anagrams");
		int j = a.length()-1;
		for(int i = 0; i < a.length()/2 ; i++) {
			chars[a.charAt(i)-65]++;
			chars[a.charAt(j)-65]++;
			int t = b.charAt(i)-65;
			int u = (int)(b.charAt(j))-65;
			System.out.println("t->"+t+", u-->"+u+"--j-->"+j+"--i -->"+b.charAt(i));
			arr[t]++;
			arr[u]++;
			j--;
			
			
		}
		
		for(int i = 0 ; i < 26; i++) {
			/*if(chars[i] != arr[i]) {
				System.out.println("Not Anagrams");
				anagrams = false;
				break;
			}*/
			System.out.println(chars[i] +"--"+arr[i]);
		}
		if( a.length() % 2 != 0) {
			System.err.println("Yes--->"+b.charAt(a.length()/2));
			chars[a.charAt(a.length()/2)-65]++;
			arr[b.charAt(a.length()/2)-65]++;
		}
		boolean anagrams = true;
		for(int i = 0 ; i < 26; i++) {
			if(chars[i] != arr[i]) {
				System.out.println("Not Anagrams");
				anagrams = false;
				break;
			}
			System.out.println(chars[i] +"--"+arr[i]);
		}
		if(anagrams) {
			System.out.println("Anagrams");
		}
		
		
		String s = "john's - & + $ ? . @ boy";
		   String reg = "[!_.',@? ]";
		   String[] res = s.split("\\W+");
		   System.out.println(res.length);
		   for(String s1:res) {
			   System.out.println(s1);
		   }
		   
		  
	}

}
