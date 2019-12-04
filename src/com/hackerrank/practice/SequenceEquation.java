package com.hackerrank.practice;

import java.util.HashMap;
import java.util.Map;

public class SequenceEquation {
    public static void main(String[] args) {

    }
    private static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        Map<Integer,Integer> storeMap = new HashMap<>();
        for (int index =0; index < p.length; index++)
            storeMap.put(index+1,p[index]);
        int n = 1;
        while (n <= p.length) {
            result[n-1] = storeMap.get(storeMap.get(n));
        }

        return result;
    }
}
