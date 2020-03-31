package com.leetcode.practice;

public class BuddyString {

    public static void main(String[] args) {

        System.out.println(new BuddyString().buddyString("aaaacb","aaaabc"));

    }

    public boolean buddyString(String A, String B) {

        if (A.length() != B.length() || A.equals(B))
            return false;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (i + 1 < A.length() && A.charAt(i) != B.charAt(i + 1) && A.charAt(i+1) != B.charAt(i))
                    return false;
                else if (i + 1 == A.length() && A.charAt(i-1) == B.charAt(i)) {
                    return  true;
                }
                else return false;

            }
        }

        return true;
    }
}
