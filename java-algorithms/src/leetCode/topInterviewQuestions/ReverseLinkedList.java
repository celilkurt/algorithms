package leetCode.topInterviewQuestions;

import java.util.ArrayList;

public class ReverseLinkedList {




    ArrayList<ListNode> list = new ArrayList<>();

    public ListNode reverseList(ListNode head) {

        while(head != null){
            list.add(head);
            head = head.next;
        }

        if(list.isEmpty())
            return null;

        list.get(0).next = null;

        for(int i = list.size()-1; i > 0; i--)
            list.get(i).next = list.get(i-1);

        return list.get(list.size()-1);


    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
