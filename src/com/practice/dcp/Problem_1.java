package com.practice.dcp;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Problem_1 {
    
    private static List<Character> B64 = new ArrayList(){{
    B64.add('A');B64.add('B');B64.add('C');B64.add('D');B64.add('E');B64.add('F');B64.add('G');B64.add('H');
    B64.add('I');B64.add('J');B64.add('K');B64.add('L');B64.add('M');B64.add('N');B64.add('O');
    B64.add('P');B64.add('Q');B64.add('R');B64.add('S');B64.add('T');B64.add('U');B64.add('V');B64.add('W');
    B64.add('X');B64.add('Y');B64.add('Z');B64.add('a');B64.add('b');B64.add('c');B64.add('d');B64.add('e');B64.add('f');
    B64.add('g');B64.add('h');B64.add('i');B64.add('j');B64.add('k');B64.add('l');B64.add('m');B64.add('n');
    B64.add('o');B64.add('p');B64.add('q');B64.add('r');B64.add('s');B64.add('t');B64.add('u');B64.add('v');
    B64.add('w');B64.add('x');B64.add('y');B64.add('z');B64.add('0');B64.add('1');B64.add('2');B64.add('3');
    B64.add('4');B64.add('5');B64.add('6');B64.add('7');B64.add('8');B64.add('9');B64.add('+');B64.add('/');
    }};
    public static void main(String[] arg) {
        
         Scanner _in = new Scanner(System.in);
        
        int nTestCases = _in.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        
        //System.err.println("B64:"+B64.size());
        
        
        
        while(nTestCases --> 0) {
            
           int size = _in.nextInt();
           String str = _in.next();
           int count = 0;
           for(int i = size-1; i >= 0 ; i--) {
               
        	 int index = B64.indexOf(str.charAt(i)) * 2;
        	 if(index > 63)
        		 index = index-63;
        	 count += B64.indexOf(B64.get(index));
        	
        	 if(i!=0) {
        		 count += B64.indexOf(str.charAt(--i));
        	 }
           }
           
           if(count > 63) {
        	   count = count%64 ;
           }
           
           if(count == 0)
            count = 64;
            
           sb.append(B64.get(64-count)+" \n");
            
        }
        
        System.out.println(sb.toString());
        
    }
}