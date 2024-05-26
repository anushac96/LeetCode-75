package pathSumIII;

import java.util.HashMap;

public class PathSumIII {
	int count = 0;
    HashMap<Long,Integer> map = new HashMap<>();
    
	public static void main(String[] args) {
//		TreeNode root = new TreeNode(10,
//				new TreeNode(5,
//						new TreeNode(3,new TreeNode(3),new TreeNode(-2)),
//						new TreeNode(2,null,new TreeNode(1))),
//				new TreeNode(-3,null, new TreeNode(11)));
//		int targetSum = 8;
		
//		TreeNode root = new TreeNode(5,
//                new TreeNode(4,
//                        new TreeNode(11,new TreeNode(7),new TreeNode(2)),
//                        null),
//                new TreeNode(8,
//                        new TreeNode(13),
//                        new TreeNode(4, new TreeNode(5), new TreeNode(1))));
//		int targetSum =22;
		
//		TreeNode root = new TreeNode(1,
//                new TreeNode(-2),
//                new TreeNode(-3));
//		int targetSum = -1;
		
//		TreeNode root = new TreeNode(0,
//                new TreeNode(1),
//                new TreeNode(1));
//		int targetSum = 1;
		
		TreeNode root = new TreeNode(1000000000,
                new TreeNode(1000000000,
                		new TreeNode(294967296,
                				new TreeNode(1000000000,
                						new TreeNode(1000000000),
                                        null),
                				null ), 
                		null),
                null);
		int targetSum = 0;
		
		PathSumIII p = new PathSumIII();
		System.out.println(p.pathSum(root,targetSum));

	}
	
	public int pathSum(TreeNode root, int targetSum) {
		map.put(0L,1);
        travel(root,targetSum,0);
        return count;
    }

    public void travel(TreeNode root, int targetSum,long sum){
        if(root==null)
            return;
        sum = sum+root.val;
        if(map.containsKey(sum-targetSum)){
        	count+= map.get(sum-targetSum);
        }
        map.put(sum,map.getOrDefault(sum, 0)+1);
        travel( root.left,  targetSum, sum);
        travel( root.right,  targetSum, sum);
        if(map.get(Long.valueOf(sum))!=1)
            map.put(sum,map.get(sum)-1);  
        else
            map.remove(sum);
        sum = sum- root.val;
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
