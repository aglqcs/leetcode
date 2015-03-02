package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
// TODO!!
public class inorder_non_rec {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        TreeNode current=root;
	        Stack<TreeNode> temp = new Stack<TreeNode>();
	        LinkedList<Integer> ret = new LinkedList<Integer>();
	        while(current != null && !temp.isEmpty()){
	        	if(current.left != null) {
	        		temp.push(current);
	        		current = current.left;
	        	}
	        	else{
	        		ret.add(current.val);
	        		if(current.right != null)
	        			current = current.right;
	        		else
	        			current = temp.pop();
	        	}
	        }
	        return ret;
	 }
}
