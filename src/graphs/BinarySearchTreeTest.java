package graphs;

import graphs.entity.BinaryTreeNode;

import java.util.Random;


import static graphs.BinarySearchTree.*;

public class BinarySearchTreeTest {

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

}
