package com.leetcode.practice;

import java.util.*;
import java.util.stream.Collectors;

public class KthWeakestRow {

    public static void main(String[] args) {

        int[][] arr  = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] res = new KthWeakestRow().kWeakestRows(arr,3);
        for (int i: res)
            System.out.println(i);
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        if(mat == null )
            return null;

        HashMap<Integer,Integer> soldiers = new HashMap<>();
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length;j++) {
                if (mat[i][j] ==1)
                    count++;
                else
                    break;
            }

            soldiers.put(i,count);
            count = 0;

        }

        System.out.println("---.>"+soldiers);

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        soldiers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        int[] result = new int[k];
        int i  = 0;
        for (int v : sortedMap.keySet()) {
            if( i < k) {
                result[i++] = v;
            }

            else break;
        }

        return result;
    }
}
