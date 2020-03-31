package com.g4g.practice;

public class BSTGivenRange {

    class Node {

        int value;

        Node left;

        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printGivenRangeEle(Node root, int k1, int k2) {

        if (root == null) { return;}

        if (root.value > k1) {
            printGivenRangeEle(root.left,k1,k2);
        }

        if (root.value >= k1 && root.value <= k2){
            System.out.println(root.value+"-> ");
        }

        if (k2 > root.value){
            printGivenRangeEle(root.right,k1,k2);
        }
    }



    public static void main(String[] args) {

    }
}
