package deleteNodeInABST;

import java.util.*;

public class DeleteNodeInABST {

	boolean found = false;
	public static void main(String[] args) {
		
		DeleteNodeInABST p = new DeleteNodeInABST();
		TreeNode root = new TreeNode(5,
                new TreeNode(3,
                    new TreeNode(2),
                    new TreeNode(4)),
                new TreeNode(6,
                    null,
                    new TreeNode(7)));
		int key = 3;
		p.deleteNode(root, key);
		List<Integer> result = treeToArray(root);
        System.out.println(result);
		
	}
	
	
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(key == root.val){
            if(root.left!=null && root.right!=null){
                TreeNode largeNode = findLargeNode(root.left);
                largeNode.right = root.right;
                root.right = null;
                return root.left;
            }else if(root.left!=null){
                return root.left;
            }else if(root.right!=null){
                return root.right;
            }else{
                return null;
            }
        }else if(key < root.val)
            root.left = deleteNode(root.left,key);
        else
            root.right = deleteNode(root.right,key);
        return root;
    }

    public TreeNode findLargeNode(TreeNode root){
        TreeNode parent = root;
        while(root!=null){
            if(root.right!=null){
                parent = root;
                root = root.right;
            }else{
                parent = root;
                root = null;
            }
        }
        return parent;
    }
    
    public static List<Integer> treeToArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                result.add(null);
            }
        }

        // Remove trailing nulls
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
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
