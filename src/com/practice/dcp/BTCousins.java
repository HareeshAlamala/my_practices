package com.practice.dcp;

public class BTCousins {

    /**
     * Two nodes in a binary tree can be called cousins if they are on the same level of the tree but have different parents. For example, in the following diagram 4 and 6 are cousins.
     *
     *     1
     *    / \
     *   2   3
     *  / \   \
     * 4   5   6
     *
     */

    public static void main(String[] args) {


    }

    private BinaryTree constructBinaryTree() {

        BinaryTree binaryTree = new BinaryTree();


        return binaryTree;
    }
    /**
     * Binary Tree
     */
    class BinaryTree {

        Node root;

        public BinaryTree() {
            root = null;
        }

        public BinaryTree(int value) {
            root = new Node(value);
        }

    }
    /*
     Node have 2 child
     */
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
