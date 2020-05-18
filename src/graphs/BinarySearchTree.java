package graphs;

import graphs.entity.BinaryTreeNode;

import java.util.Random;

public class BinarySearchTree {

    public static void main(String[] args){

        BinaryTreeNode root = createSampleTree(23);
        printValuesDESC(root);
        System.out.println();
        printValuesASC(root);


    }

    public static BinaryTreeNode createSampleTree(int n){
        Random ran = new Random();

        BinaryTreeNode root = new BinaryTreeNode(ran.nextInt(100));

        while(n-- > 0){
            addNode(root,new BinaryTreeNode(ran.nextInt(100)));
        }

        return root;
    }

    public static void addNode(BinaryTreeNode tempRoot,BinaryTreeNode newNode){

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

    public static void printValuesDESC(BinaryTreeNode tempRoot){

        if(tempRoot.getRight() != null){
            printValuesDESC(tempRoot.getRight());
        }

        System.out.print(tempRoot.getValue() + " ");

        if(tempRoot.getLeft() != null){
            printValuesDESC(tempRoot.getLeft());
        }

    }

    public static void printValuesASC(BinaryTreeNode tempRoot){

        if(tempRoot.getLeft() != null){
            printValuesASC(tempRoot.getLeft());
        }

        System.out.print(tempRoot.getValue() + " ");

        if(tempRoot.getRight() != null){
            printValuesASC(tempRoot.getRight());
        }
    }

}
