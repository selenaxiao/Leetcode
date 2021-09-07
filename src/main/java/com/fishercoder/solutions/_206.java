package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _206 {

    public static class Solution1 {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    public static class Solution2 {
        public ListNode reverseList(ListNode head) {
            return reverse(head, null);
        }

        ListNode reverse(ListNode head, ListNode newHead) {
            if (head == null) {
                return newHead;
            }
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
            return reverse(head, newHead);
        }
    }

}