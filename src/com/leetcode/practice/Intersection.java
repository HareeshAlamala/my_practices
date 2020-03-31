package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {
        int[] num11 = {1,2,2,1};
        int[] num12 = {2,2};
        intersect(num11,num12);
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        List<Integer> cache = new ArrayList<>();
        for(int n: nums2) {
            cache.add(n);
        }

        for(int n: nums1) {
            if(cache.contains(n)) {
                result.add(n);
                cache.remove((Integer) n);
            }
        }


        int[] res = new int[result.size()];
        int i = 0;
        System.out.print("-->"+result);
        for(int n: result) {
            res[i++] = n;
        }

        return res;
    }
}
