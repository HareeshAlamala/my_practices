package com.leetcode.practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("[]{}"));
    }

    public static boolean isValid(String s) {
        HashMap<Character,Character> cache = new HashMap<>();
        cache.put('{','}');
        cache.put('[',']');
        cache.put('(',')');
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            if(s.charAt(index) == '(' || s.charAt(index) == '[' || s.charAt(index) == '{') {
                stack.push(s.charAt(index));
            } else if (stack.isEmpty() || cache.get(stack.pop()) != s.charAt(index)){

                return false;
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }
}
