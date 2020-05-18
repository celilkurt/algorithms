package graphs;

import java.util.Random;

public class BinarySearchTree {

    public static void main(String[] args){

        Node root = createSampleTree(23);
        printValuesDESC(root);
        System.out.println();
        printValuesASC(root);


    }

    public static Node createSampleTree(int n){
        Random ran = new Random();

        Node root = new Node(ran.nextInt(100));

        while(n-- > 0){
            addNode(root,new Node(ran.nextInt(100)));
        }

        return root;
    }

    public static void addNode(Node tempRoot,Node newNode){

        if(tempRoot.getValue() < newNode.getValue()){
            if(tempRoot.getRight() == null)
                tempRoot.setRight(newNode);
            else
                addNode(tempRoot.getRight(),newNode);

        }else{
            if(tempRoot.getLeft() == null)
                tempRoot.setLeft(newNode);
            else
                addNode(tempRoot.getLeft(),newNode);

        }
    }

    public static void printValuesDESC(Node tempRoot){

        if(tempRoot.getRight() != null){
            printValuesDESC(tempRoot.getRight());
        }

        System.out.print(tempRoot.getValue() + " ");

        if(tempRoot.getLeft() != null){
            printValuesDESC(tempRoot.getLeft());
        }

    }

    public static void printValuesASC(Node tempRoot){

        if(tempRoot.getLeft() != null){
            printValuesASC(tempRoot.getLeft());
        }

        System.out.print(tempRoot.getValue() + " ");

        if(tempRoot.getRight() != null){
            printValuesASC(tempRoot.getRight());
        }
    }

}

class Node{

    private int value;
    private Node right;
    private Node left;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}