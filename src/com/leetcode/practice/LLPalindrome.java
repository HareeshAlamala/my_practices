package com.leetcode.practice;



public class LLPalindrome {

    public static void main(String[] args) {

    }


    private static boolean isPalindrom(ListNode head) {

        if (head == null || head.next == null)
            return true;

        StringBuilder llValues = new StringBuilder();
        ListNode listNode = head;
        while (listNode != null){
            llValues.append(listNode.val);
            listNode = listNode.next;
        }
        listNode = reverseLL(head);

        StringBuilder llValuesRev = new StringBuilder();
        while (listNode != null){
            llValuesRev.append(listNode.val);
            listNode = listNode.next;
        }


        return llValues.toString().equals(llValuesRev.toString());
    }

    private static ListNode reverseLL(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    /* Single Linked List Node */

    class ListNode {

        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
