package com.g4g.practice;

import java.util.LinkedList;
import java.util.Queue;

class Node<T> {

    T value;

    Node left, right;

    public Node(T value) {
        this.value = value;
        left = right = null;
    }


}

public class BinaryTree  {

    Node<Integer> root;

    public BinaryTree() {
       root = null;
    }

    public void levelOrderTraversal() {

        int height = calculateHeight(root);
        for (int h = 1; h <= height; h++) {
            printGivenLevel(root,h);
        }
    }

    public void printGivenLevel(Node root, int level) {

        if (root == null) return;

        if (level == 1) {
            System.out.println(root.value);
            return;
        }

        printGivenLevel(root.left, level-1);
        printGivenLevel(root.right, level-1);


    }

    public int calculateHeight(Node root) {
        if(root == null)
            return 0;
        int leftH = calculateHeight(root.left);
        int rightH = calculateHeight(root.right);

        return (leftH > rightH)? leftH+1: rightH +1;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);

        binaryTree.levelOrderTraversal();

        System.out.println("----Calling Level Order Traversal Using Queue ---");

       // binaryTree.levelOrderTraversalUsingQ();
        binaryTree.sumTree(binaryTree.root);
        System.out.println("----- Print after Sum tree-----");
        binaryTree.levelOrderTraversalUsingQ();
    }

    /**
     * Using Queue
     */
    public void levelOrderTraversalUsingQ() {

        Queue<Node> nodeQueue = new LinkedList<>();

        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node tempNode = nodeQueue.poll();
            System.out.println(tempNode.value);

            if (tempNode.left != null)
                nodeQueue.add(tempNode.left);

            if (tempNode.right != null)
                nodeQueue.add(tempNode.right);
        }

    }

    /**
     * Sum Tree
     */

    public int sumTree(Node<Integer> root) {

        if (root == null)
            return 0;

        Integer oldValue = root.value;

        root.value = sumTree(root.left) + sumTree(root.right);

        return root.value + oldValue;

    }
}
