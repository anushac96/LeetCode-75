package lowestCommonAncestorOfABinaryTree;
public class LowestCommonAncestorOfABinaryTree {

	public static void main(String[] args) {
		LowestCommonAncestorOfABinaryTree a = new LowestCommonAncestorOfABinaryTree();
		TreeNode root = new TreeNode(3,
	            new TreeNode(5,
	                new TreeNode(6),
	                new TreeNode(2,
	                    new TreeNode(7),
	                    new TreeNode(4))),
	            new TreeNode(1,
	                new TreeNode(0),
	                new TreeNode(8)));
		TreeNode p = new TreeNode(5);
		TreeNode q = new TreeNode(1);
		
//		TreeNode root = new TreeNode(-1,
//	            new TreeNode(0,
//	                new TreeNode(-2,
//	                    new TreeNode(8),
//	                    null),
//	                new TreeNode(4) ),
//	            new TreeNode(3));
//		TreeNode p = new TreeNode(8);
//		TreeNode q = new TreeNode(4);	

		System.out.println(a.lowestCommonAncestor(root, p, q).val);

	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null)
			return null;
		else if(root.val==p.val || root.val==q.val)
			return root;
		
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
		
		if(left!=null && right!=null) {
			return root;
		}else if(left!=null)
				return left;
		else
			return right;
		
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

