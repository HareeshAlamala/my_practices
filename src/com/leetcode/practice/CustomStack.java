package com.leetcode.practice;
class CustomStack2 {

    int[] stack;
    int top = -1;
    public CustomStack2(int maxSize) {
        stack = new int[maxSize];
    }

    public void push(int x) {

        if(stack.length-1 == top)
            return;

        stack[top++] = x;
    }

    public int pop() {

        if(top == -1) {
            return -1;
        }

        return stack[top--];
    }

    public void increment(int k, int val) {

        if(top == -1)
            return;

        for (int i = top; i >= 0 && k >0; i--,k--) {
            stack[i] = stack[i] + val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

public class CustomStack {

    public static void main(String[] args) {

        CustomStack2 s = new CustomStack2(4);
        s.push(1);
        s.push(2);
        s.push(4);
        System.out.println("POP: "+s.pop());

    }
}