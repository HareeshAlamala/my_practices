/**
 * 
 */
package com.hackerearth.practice;

import java.util.*;

/**
 * @author Hareesh Alamala
 *
 */
public class ToyBox {

	@SuppressWarnings({ "resource", "unused" })
	public void solutionCall() {
		Scanner _in = new Scanner(System.in);
		int toys = _in.nextInt();
		int boxes = _in.nextInt();
		// int max = (toys > boxes)?toys:boxes;
		HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();
		for (int i = 0; i < toys; i++) {
			int price = _in.nextInt();
			int index = _in.nextInt();
			if (null == pair.get(index)) {
				pair.put(index, price);
			} else {
				if (pair.get(index) < price)
					pair.put(index, price);
			}

		}

		System.out.println(pair.values().stream().mapToInt(i -> i.intValue()).sum());
	}
}
