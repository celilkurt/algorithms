package main.leetCode.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class TraverseATree {

    class PreOrderTraverse {


        public List<Integer> preorderTraversal(TreeNode root) {

            ArrayList<Integer> nums = new ArrayList<>();
            if (root != null) {
                preorderTraversalRec(root, nums);
            }

            return nums;
        }

        public void preorderTraversalRec(TreeNode node, List<Integer> nums) {

            nums.add(node.val);

            if (node.left != null) {
                preorderTraversalRec(node.left, nums);
            }

            if (node.right != null) {
                preorderTraversalRec(node.right, nums);
            }
        }

    }

    class InorderTraversal {
        // left -> root -> right

        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> nums = new ArrayList<>();
            if (root != null) {
                inorderTraversalRec(root, nums);
            }

            return nums;

        }

        public void inorderTraversalRec(TreeNode node, List<Integer> nums) {

            if (node.left != null) {
                inorderTraversalRec(node.left, nums);
            }
            nums.add(node.val);
            if (node.right != null) {
                inorderTraversalRec(node.right, nums);
            }

        }


    }

    class PostTraversal {
        // left -> root -> right

        public List<Integer> postorderTraversal(TreeNode root) {

            List<Integer> nums = new ArrayList<>();
            if (root != null) {
                postorderTraversalRec(root, nums);
            }

            return nums;

        }

        public void postorderTraversalRec(TreeNode node, List<Integer> nums) {

            if (node.left != null) {
                postorderTraversalRec(node.left, nums);
            }
            if (node.right != null) {
                postorderTraversalRec(node.right, nums);
            }
            nums.add(node.val);
        }


    }


}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
