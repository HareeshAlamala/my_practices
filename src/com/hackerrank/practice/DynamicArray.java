package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public static void main(String[] args) {

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<Integer> result = new ArrayList<>();

        int lastAnswer = 0;
        // Number of seq: n
        List<Integer>[] seq = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            seq[i] = new ArrayList();
        }

        for (List<Integer> query: queries) {
            // get query type
            if(1 == query.get(0)) {
                seq[(query.get(1)^lastAnswer)%n].add(query.get(2));
            } else {
                int size = seq[(query.get(1)^lastAnswer)%n].size();
                lastAnswer = seq[(query.get(1)^lastAnswer)%n].get(query.get(2)%size);
                result.add(lastAnswer);
            }
        }

        return result;

    }
}
