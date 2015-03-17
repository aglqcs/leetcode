package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal {
	  public List<Integer> preorderTraversal(TreeNode root) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        if(root == null) return result;
	        Stack<TreeNode> output = new Stack<TreeNode>();
	        output.add(root);
	        while( !output.isEmpty() ){
	        	TreeNode current = output.pop();
	        	result.add(current.val);
	        	if(current.right != null)
	        		output.add(current.right);
	        	if(current.left != null)
	        		output.add(current.left);
	        }
	        return result;
	  }
}
