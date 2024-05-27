package longestZigZagPathInABinaryTree;

public class LongestZigZagPathInABinaryTree {

	int count1 = 0;
	int count2 = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,
				null,
				new TreeNode(2,
						new TreeNode(3),
						new TreeNode(4,
								new TreeNode(5,
										null,
										new TreeNode(7,
												null,
												new TreeNode(8))),
								new TreeNode(6))));
		LongestZigZagPathInABinaryTree p = new LongestZigZagPathInABinaryTree();
		System.out.println(p.longestZigZag1(root));
		System.out.println(p.longestZigZag2(root));
	}

	public int longestZigZag1(TreeNode root) {
		travel1(root, 0, false);
		travel1(root, 0, true);
		return count1;
	}

	public void travel1(TreeNode root, int step, boolean goLeft) {
		if (root == null) {
			return;
		}
		count1 = Math.max(count1, step);
		if (goLeft) {
			travel1(root.left, step + 1, false);
			travel1(root.right, 1, true);
		} else {
			travel1(root.right, step + 1, true);
			travel1(root.left, 1, false);
		}
	}
	
	public int longestZigZag2(TreeNode root) {
        travel2(root,0,0);
        return count2;
    }

    public void travel2(TreeNode root, int l, int r){
        if(root==null){
            return;
        }
        count2 = Math.max(count2,Math.max(l,r));
        travel2(root.left,r+1,0);
        travel2(root.right,0,l+1);
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
