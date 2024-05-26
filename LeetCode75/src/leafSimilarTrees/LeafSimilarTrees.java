package leafSimilarTrees;

import java.util.*;


public class LeafSimilarTrees {

	public static void main(String[] args) {
//		TreeNode root1 = new TreeNode(3,
//				new TreeNode(5,new TreeNode(6),new TreeNode(2,new TreeNode(7),new TreeNode(4))),
//				new TreeNode(1,new TreeNode(9),new TreeNode(8)));
//		TreeNode root2 = new TreeNode(3,
//				new TreeNode(5,new TreeNode(6),new TreeNode(7)),
//				new TreeNode(1,new TreeNode(4),
//						new TreeNode(2,new TreeNode(9),new TreeNode(8))));
		
		TreeNode root1 = new TreeNode(119,
				new TreeNode(113,
						new TreeNode(11,
								new TreeNode(43,new TreeNode(67),new TreeNode(74)),
								new TreeNode(76)),
						new TreeNode(30,new TreeNode(15),new TreeNode(60))),
				null);
		
		TreeNode root2 = new TreeNode(11,
				new TreeNode(69,
						new TreeNode(115,new TreeNode(67),new TreeNode(74)),
						new TreeNode(66,null,new TreeNode(76))),
				new TreeNode(60,
						new TreeNode(15),
						new TreeNode(60)));
		
		LeafSimilarTrees p = new LeafSimilarTrees();
		System.out.println(p.leafSimilar(root1, root2));
	}
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String str1 = "";
        String str2 = "";

        str1 = travel(root1,str1);
        str2 = travel(root2,str2);

        System.out.println(str1);
        System.out.println(str2);
        
        if(str1.compareTo(str2)==0)
            return true;
        else
            return false;
    }

    public String travel(TreeNode root, String str){
        if(root==null)
            return str;
        else{
            if(root.left==null && root.right==null){
                str = str + root.val + "-";
            }
            else{
                str = travel(root.left,str);
                str = travel(root.right,str);
            }
        }
        return str;
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
