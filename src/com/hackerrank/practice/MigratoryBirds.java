package com.hackerrank.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public static void main(String[] args) {

    }
    private static int migratoryBirds(List<Integer> arr) {

       Map<Integer,Integer> countMap =  arr.stream().collect(Collectors.toMap(Function.identity(), v->1,Integer::sum));
       int max = 0;
       int element = 0;
       for(int i = 1; i <=5; i++) {
           if(countMap.getOrDefault(i,0) > max) {
               max = countMap.get(i);
                element = i;
           }
       }

       return element;
    }
}
