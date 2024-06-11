package binaryTreeRightSideView;

import java.util.*;

public class BinaryTreeRightSideView {

	List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,
                new TreeNode(2,
                    null,
                    new TreeNode(5)),
                new TreeNode(3,
                    null,
                    new TreeNode(4)));
		BinaryTreeRightSideView p = new BinaryTreeRightSideView();
		
		System.out.println(p.rightSideView(root).toString());

	}
	
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            travel(queue);
        }
        return list;
    }

    public void travel(Queue<TreeNode> queue){
        Queue<TreeNode> newQueue = new LinkedList<>();
        if(!queue.isEmpty()){
            list.add(queue.peek().val);
            while(!queue.isEmpty()){
                if(queue.peek().right!=null)
                    newQueue.add(queue.peek().right);
                if(queue.peek().left!=null)
                    newQueue.add(queue.peek().left);
                queue.poll();
            }
            travel(newQueue);
        }
        return;
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