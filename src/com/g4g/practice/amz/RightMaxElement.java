package com.g4g.practice.amz;

/**
 *
 */
public class RightMaxElement {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {

        for (int n:getMaxRightElements(new int[] {16,17,4,3,5,2}) )
            System.out.println(n);

    }

    public static int[] getMaxRightElements(int[] nums) {

        int max = nums[nums.length-1];

        for (int i = nums.length-2; i >= 0; i--) {
            int t = nums[i];
            nums[i] = max;
            max = Math.max(max,t);
        }

        return nums;
    }


}
