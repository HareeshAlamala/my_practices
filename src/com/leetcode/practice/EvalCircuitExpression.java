package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvalCircuitExpression {
    public static void main(String[] args) {


    }

    public char evalCircuitExpr(List<String> exprList) {

        Stack<Character> storeExpr = new Stack<>();

        for (String expr: exprList) {

            for (int i = 0; i < expr.length(); i++) {
                if (expr.charAt(i) == ']') {
                    int val1 = Integer.parseInt(storeExpr.pop().toString());
                    char op = storeExpr.pop();
                    if (op == '!') {
                        storeExpr.push((char)('0'+ doLogicalOps(val1,0,op)));
                        continue;
                    }
                    int val2 = Integer.parseInt(storeExpr.pop().toString());
                    storeExpr.push((char)('0'+ doLogicalOps(val1,val2,op)));
                } else if (expr.charAt(i) != ',')
                    storeExpr.push(expr.charAt(i));
            }
        }

        if(!storeExpr.isEmpty()) {
            int val1 = Integer.parseInt(storeExpr.pop().toString());
            char op = storeExpr.pop();
            if (op == '!') {
                storeExpr.push((char)('0'+ doLogicalOps(val1,0,op)));
                return storeExpr.pop();
            }
            int val2 = Integer.parseInt(storeExpr.pop().toString());
            return (char)('0'+ doLogicalOps(val1,val2,op));
        }
        return '0';
    }


    public int doLogicalOps(int a, int b, char op) {
        switch (op) {
            case '!': return ~a;
            case '&': return (a&b);
            case '|': return (a|b);
        }

        return 0;
    }
}
