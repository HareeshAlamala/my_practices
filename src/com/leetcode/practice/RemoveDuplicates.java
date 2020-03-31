package com.leetcode.practice;

import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return head;

        ListNode itr = head;
        int prev = itr.val;


        while (itr.next != null) {
           if(prev == itr.next.val) {
               itr.next  = itr.next.next;
           } else {
               itr = itr.next;
               prev = itr.val;
           }
        }

        return  head;
    }
}
