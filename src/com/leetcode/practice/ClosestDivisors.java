package com.leetcode.practice;

public class ClosestDivisors {

    public int[] closestDivisors(int num) {

        int closeness = Integer.MAX_VALUE;

        int itr = 0;

        int[] result = new int[2];

        while (itr++ < 2) {

            num = num +1 ;

            for (int i = 1; i*i < num; i++) {

                if (num%i == 0) {

                    if (num/i == i) {
                        return new int[]{i,i};
                    } else {
                        int temp = Math.abs(i-num/i);
                        if (temp < closeness){
                            result[0] = i;
                            result[1] = num/i;
                        }
                    }


                }
            }
        }

        return result;
    }
}
