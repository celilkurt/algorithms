package main.leetCode.linkedList;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> nodeSet = new HashSet<>();

        while (headA != null) {
            if (!nodeSet.add(headA)) {
                return headA;
            }
            headA = headA.next;

            if (headB != null) {
                if (!nodeSet.add(headB)) {
                    return headB;
                }
                headB = headB.next;
            }
        }

        while (headB != null) {
            if (!nodeSet.add(headB)) {
                return headB;
            }
            headB = headB.next;


        }

        return null;

    }

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

}
