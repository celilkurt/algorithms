package main.leetCode.linkedList;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }

        }

        return false;
    }



      // Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

}
