package leetCode.topInterviewQuestions;

//Invert a binary tree.
public class InvertBinaryTree {

    public static void main(String[] args){




    }


     public class TreeNode {
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


        public static TreeNode invertTree(TreeNode root) {

            if(root == null)
                return null;

            if(root.left != null && root.right != null){
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;

            }else if(root.left != null){
                root.right = root.left;
                root.left = null;

            }else if(root.right != null){
                root.left = root.right;
                root.right = null;

            }

            invertTree(root.left);
            invertTree(root.right);

            return root;
        }
}
