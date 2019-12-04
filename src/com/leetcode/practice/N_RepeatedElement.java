/**
 * 
 */
package com.leetcode.practice;
import java.util.*;
import java.util.stream.Collectors;

import javax.swing.border.EtchedBorder;

/**
 * @author Hareesh Alamala
 *
 */
public class N_RepeatedElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solutionCall(int[] A) {
		Map<Integer,Integer> countMap = new HashMap<>();
		int distinctElements = 0;
		for(int element: A) {
			if(null == countMap.get(element)) {
				distinctElements++;
				countMap.put(element, 1);
			}
			else {
				countMap.put(element, countMap.get(element)+1);
			}
				
		}
		for (Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
			if(entry.getValue() == distinctElements)
				return entry.getKey();
						
		}
		return 0;
	}

}
