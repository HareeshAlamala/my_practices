package com.leetcode.practice;

public class MySqrt {

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(8));
    }
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int low = 0;
        int high = Integer.MAX_VALUE;

        while (low < high ) {
            int mid = (low+high)/2;
            if (mid > x/mid)
                high = mid -1;
            else {

                if ((mid+1) > x/(mid+1))
                    return mid+1;
                low = mid + 1;

            }
        }

        return 0;
    }
}
