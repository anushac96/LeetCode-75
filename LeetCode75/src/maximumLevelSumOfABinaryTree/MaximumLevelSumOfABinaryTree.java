package maximumLevelSumOfABinaryTree;

import java.util.*;

public class MaximumLevelSumOfABinaryTree {

	int level = 1;
    int max = Integer.MIN_VALUE;
    int finalLevel = 1;
    
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,
                new TreeNode(7,
                    new TreeNode(7),
                    new TreeNode(-8)),
                new TreeNode(0,
                    null,
                    null));
		MaximumLevelSumOfABinaryTree p = new MaximumLevelSumOfABinaryTree();
		
		System.out.println(p.maxLevelSum(root));
	}
	
	public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            travel(queue);
        }
        return finalLevel;
    }

    public void travel(Queue<TreeNode> queue){
    	int sum =0;
        Queue<TreeNode> newQueue = new LinkedList<>();
        while(!queue.isEmpty()){
            if(queue.peek().right!=null)
                newQueue.add(queue.peek().right);
            if(queue.peek().left!=null)
                newQueue.add(queue.peek().left);
            sum = sum+queue.poll().val;
            
        }
        if(max<sum){
            max = sum;
            finalLevel = level;
        }
        if(!newQueue.isEmpty()){
            level++;
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