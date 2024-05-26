package countGoodNodesInBinaryTree;

public class CountGoodNodesInBinaryTree {
	int count =0;
	public static void main(String[] args) {
		CountGoodNodesInBinaryTree p = new CountGoodNodesInBinaryTree();
//		TreeNode root = new TreeNode(3,
//				new TreeNode(1,new TreeNode(3),null),
//				new TreeNode(4,new TreeNode(1),new TreeNode(5)));
		TreeNode root = new TreeNode(2,
				null,
				new TreeNode(4,
						new TreeNode(10),
						new TreeNode(8,new TreeNode(4),null)));
		System.out.println(p.goodNodes(root));
	}
	
	public int goodNodes(TreeNode root) {

        int max = root.val;
        int count = travel(root,max);
        return count;
    }

    public int travel(TreeNode root, int max){
        if(root==null)
            return count;
        if(max<=root.val){
            count++;
            max = root.val;
        }
        count = travel(root.left,max);
        count = travel(root.right,max);

        return count;
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
