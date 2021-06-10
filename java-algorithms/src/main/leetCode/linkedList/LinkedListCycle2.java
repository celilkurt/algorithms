package main.leetCode.linkedList;

import java.util.HashSet;

public class LinkedListCycle2 {


    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        HashSet<ListNode> nodeSet = new HashSet<>();
        nodeSet.add(head);
        while (head.next != null) {
            head = head.next;
            if (!nodeSet.add(head)) {
                return true;
            }
        }

        return false;
    }

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

    }
}
