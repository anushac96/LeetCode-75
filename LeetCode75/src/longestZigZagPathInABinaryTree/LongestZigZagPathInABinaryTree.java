package longestZigZagPathInABinaryTree;

public class LongestZigZagPathInABinaryTree {

	int count = 0;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,
				null,
				new TreeNode(1,
						new TreeNode(1),
						new TreeNode(1,
								new TreeNode(1,
										null,
										new TreeNode(1,
												null,
												new TreeNode(1))),
								new TreeNode(1))));
		LongestZigZagPathInABinaryTree p = new LongestZigZagPathInABinaryTree();
		System.out.println(p.longestZigZag(root));

	}

	public int longestZigZag(TreeNode root) {
		travel(root, 0, false);
		travel(root, 0, true);
		return count;
	}

	public void travel(TreeNode root, int step, boolean goLeft) {
		if (root == null) {
			return;
		}
		count = Math.max(count, step);
		if (goLeft) {
			travel(root.left, step + 1, false);
			travel(root.right, 1, true);
		} else {
			travel(root.right, step + 1, true);
			travel(root.left, 1, false);
		}
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
