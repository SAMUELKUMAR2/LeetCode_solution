
public class Diameter_of_binarytree_543 {
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
		 
		class Solution {
		    public int diameterOfBinaryTree(TreeNode root) {
		    	if(root == null) {
		    		return 0;
		    	}
		    	int leftdiameter = diameterOfBinaryTree(root.left);
		    	int rightdiameter = diameterOfBinaryTree(root.right);
		    	int selfdiameter = ht(root.left)+ht(root.right)+2;
		    	return Math.max(leftdiameter, Math.max(rightdiameter, selfdiameter));
		        
		    }
		    private int ht(TreeNode node) {
		    	if(node==null) {
		    		return -1;
		    	}
		    	
		    	int leftheight= ht(node.left);
		    	int rightheight = ht(node.right);
		    	return Math.max(leftheight, rightheight)+1;
		    }
		}

}
