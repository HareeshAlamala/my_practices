package com.hackerrank.practice;

public class CatAndRat {

    public static void main(String[] args) {

    }
    private static String catAndMouse(int x, int y, int z) {
        return (Math.abs(z-x) > Math.abs(z-y))? "Cat A" :(2*z==x+y)?"Mouse C":"Cat B";
    }
}
