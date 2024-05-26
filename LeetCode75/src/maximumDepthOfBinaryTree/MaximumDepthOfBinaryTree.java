package maximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree p = new MaximumDepthOfBinaryTree();
		TreeNode root = new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new 
				TreeNode(15,null,null),new TreeNode(7,null,null)));
		
		System.out.println(p.maxDepth(root));
	}
	
	public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else{
            return 1+(Math.max(maxDepth(root.left),maxDepth(root.right)));
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
