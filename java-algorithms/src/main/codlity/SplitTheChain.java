package main.codlity;

public class SplitTheChain {


    public static void main(String[] args) {


        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        int result = solution(arr);
        System.out.println(result);


    }

    public static int solution(int[] A) {

        if(A.length < 5) return -1;

        int minCost = A[1] + findSecondMin(A, 3);

        int len = A.length;
        for (int i = 3; i < len-2; i++) {

            int newCost = A[i] + findSecondMin(A, i+2);

            if (newCost < minCost ) {
                minCost = newCost;
            }
        }

        return minCost;

    }

    static int findSecondMin(int[] arr, int startI) {


        int min = arr[startI];
        for (int i = startI+1; i < arr.length-1; i++) {
            if (min > arr[i] ) {
                min = arr[i];
            }
        }

        return min;

    }


}

class SegmentTree {

    Node root;

    public SegmentTree(int[] arr) {
        root = calMinTree(arr, 0, arr.length-1);
    }

    Node calMinTree(int[] A, int i, int j) {

        if (i == j) {
            return new Node(A[i]);
        } else {
            int p = (j-i)/2;
            Node left = calMinTree(A, i, p);
            Node right = calMinTree(A, p+1, j);
            Node root;
            if(left.value < right.value) {
                root = new Node(left.value);
            }else{
                root = new Node(right.value);
            }
            root.left = left;
            root.right = right;
            return root;
        }

    }

    int findMin(Node root, int start, int end, int tarStart, int tarEnd) {

        if (start >= tarStart && end <= tarEnd || end == start){
            return root.value;
        } else if (start >= tarStart ) {

        }
        else {
            int p = (end-start)/2;
            int leftVal = findMin(root.left, start, p, tarStart, tarEnd);
            int rightVal = findMin(root.right, p+1, end, tarStart, tarEnd);
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    class Node {
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }

    }

}


