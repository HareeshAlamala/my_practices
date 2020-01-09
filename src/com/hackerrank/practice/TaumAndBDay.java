package com.hackerrank.practice;

public class TaumAndBDay {

    public static void main(String[] args) {


        System.out.println(taumBday(27984 ,1402,619246,615589 ,247954));

        System.out.println(619246*27984L + 1402*615589L);
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {

        /* check minimum cost cake cost */

        long optimalCost = Math.min(bc+z,wc+z);
        if (optimalCost-bc == z) {
            if (optimalCost < wc)
                return 1L*bc*b + 1L*optimalCost*w;
        }
        else {
            if (optimalCost < bc)
                return (1L*wc*w + 1L*optimalCost*b);
        }
        return (1L*bc*b + 1L*wc*w);
    }
}
