package com.hackerearth.practice;

import java.util.Scanner;

public class TheDice {

    public static void main(String[] args) {

        Scanner _sc = new Scanner(System.in);

        String rolledDiceNumbers = _sc.next();

        int numberOfPlayers = 0;


        for(int loop_i = 0; loop_i < rolledDiceNumbers.length(); loop_i++) {

            if(rolledDiceNumbers.charAt(loop_i)=='6')
                numberOfPlayers++;

        }
        if(rolledDiceNumbers.charAt(rolledDiceNumbers.length()-1) == '6'){
            System.out.println("-1");

        } else
            System.out.println(rolledDiceNumbers.length()-numberOfPlayers);

    }
}
