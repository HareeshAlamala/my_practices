package com.leetcode.practice;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(7));
    }

    public boolean isHappy(int n) {
        Set<Integer> cache = new HashSet<>();
        cache.add(n);
        while (n != 1) {

            int result = sumOfSqrare(n);
            if (cache.contains(result))
                return false;
            cache.add(result);

            n = result;
        }

        return true;

    }

    public int sumOfSqrare(int n) {
        int total = 0;
        while (n != 0) {
            int lsn = n%10;
            total = total + lsn*lsn;
            n = n/10;
        }
        return total;
    }
}
