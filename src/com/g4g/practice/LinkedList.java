package com.g4g.practice;

class LNode<T> {
    T value;
    LNode next;
    public LNode(T value) {
        this.value = value;
    }
}

public class LinkedList {

    LNode<Integer> head;

    public void removeMiddleOne() {
        int middleOne = 0;
        int len = length();

        middleOne = len/2 + 1;
    }

    public int length() {
        int count = 0;
        LNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
