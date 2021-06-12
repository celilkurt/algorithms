package main.leetCode.linkedList;

import main.leetCode.linkedList.LinkedListCycle.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;


        Stack<ListNode> nodeStack = new Stack<>();

        while (head != null) {

            nodeStack.push(head);
            head = head.next;
        }

        head = nodeStack.pop();

        ListNode tempNode = head;
        while (!nodeStack.isEmpty()) {
            tempNode.next = nodeStack.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;

        return head;

    }

}
