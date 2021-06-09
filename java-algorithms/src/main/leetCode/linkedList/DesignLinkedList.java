package main.leetCode.linkedList;

public class DesignLinkedList {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        System.out.println(linkedList.get(1));
        linkedList.deleteAtIndex(1);
        System.out.println(linkedList.get(1));
    }

}


class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {

    private Node head;
    private int size = 0;


    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index >= size) return -1;
        else {
            Node tempNode = head;
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.next;
            }
            return tempNode.val;
        }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        size++;
        Node tempHead = this.head;
        this.head = new Node(val);
        this.head.next = tempHead;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        size++;
        Node newNode = new Node(val);

        if (head == null) head = newNode;
        else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {


        if (index == 0) {
            addAtHead(val);
        } else if (index <= size) {
            Node tempNode = head;
            while (index-- > 1) {
                tempNode = tempNode.next;
            }

            Node newNode = new Node(val);
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int indexCopy = index;

        if (index < size) {
            if (index == 0) {
                if (head != null) {
                    head = head.next;
                }
            } else {

                Node tempNode = head;
                while (index-- > 1) {
                    tempNode = tempNode.next;
                }

                if(indexCopy == size-1) {
                    tempNode.next = null;
                } else {
                    tempNode.next = tempNode.next.next;
                }

            }
            size--;
        }


    }
}
