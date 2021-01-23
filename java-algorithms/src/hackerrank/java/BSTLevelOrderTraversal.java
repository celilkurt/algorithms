package hackerrank.java;

import java.io.*;
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTLevelOrderTraversal{

    static HashMap<Integer, ArrayList<Node>> levelMap = new HashMap<>();

    static void levelOrder(Node root){

        int curLevel = 0;
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(root);
        levelMap.put(curLevel, nodes);

        curLevel++;

        while(levelMap.containsKey(curLevel-1)){
            nodes = new ArrayList<>();
            for(Node node: levelMap.get(curLevel-1)){

                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
            if(!nodes.isEmpty()){
                levelMap.put(curLevel, nodes);
            }
            curLevel++;

        }

        for(int level: levelMap.keySet()){
            for(Node node: levelMap.get(level)){
                System.out.print(node.data + " ");
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
