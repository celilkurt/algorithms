package main.leetCode.linkedList;

import main.leetCode.linkedList.LinkedListCycle.ListNode;

public class RemoveNthNode {



    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headBackup = head;
        ListNode tail = head;

        for (int i = 0; i < n; i++) {
            tail = tail.next;
        }

        while (tail.next != null) {
            tail = tail.next;
            head = head.next;
        }

        head.next = head.next.next;

        return headBackup;
    }


}
