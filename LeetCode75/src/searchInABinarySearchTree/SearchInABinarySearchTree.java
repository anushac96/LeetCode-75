package searchInABinarySearchTree;



public class SearchInABinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4,
                new TreeNode(2,
                    new TreeNode(1),
                    new TreeNode(3)),
                new TreeNode(7));
		int val = 2;
		SearchInABinarySearchTree p = new SearchInABinarySearchTree();
		
		System.out.println(p.searchBST(root,val).val);

	}
	
	public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return root;
        if(val == root.val){
            return root;
        }else if(val < root.val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);
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
