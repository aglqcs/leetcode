package leetcode;

import java.util.LinkedList;
import java.util.List;

public class pathsum_2 {
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
		 	if(root == null) return result;
		 	LinkedList<Integer> current = new LinkedList<Integer>();
		 	rec(root,sum,result,current);
		 	return result;
	        
	    }
	 public static void rec(TreeNode root,int sum,LinkedList<List<Integer>> result,LinkedList<Integer> temp){
		if(root.val == sum && root.left == null && root.right == null){
			 temp.add(root.val);
			 result.add(temp);
			 return;
		 }
		 else{
			 if(root.left == null && root.right == null){
				 return;
			 }
			 if(root.left != null){
				 LinkedList<Integer> t = (LinkedList<Integer>) temp.clone();
				 t.add(root.val);
				 rec(root.left,sum - root.val,result,t);
			 }
			 if(root.right != null){
				 LinkedList<Integer> t = (LinkedList<Integer>) temp.clone();
				 t.add(root.val);
				 rec(root.right,sum - root.val,result,t);
			 }
		 }
	 }
}
