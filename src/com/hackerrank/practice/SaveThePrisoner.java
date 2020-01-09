package com.hackerrank.practice;

public class SaveThePrisoner {

    public static void main(String[] args) {

    }

    static int saveThePrisoner(int n, int m, int s) {
        if((m+s-1)%n== 0)
            return n;
        return (m+s-1)%n;

    }
}
