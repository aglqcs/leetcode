package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class preOrder_non_rec {
	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> temp = new Stack<TreeNode>();
        LinkedList<Integer> ret = new LinkedList<Integer>();
        if(root == null) return ret;
        temp.push(root);
        while( !temp.isEmpty()){
        	TreeNode p = temp.pop();
        	ret.add(p.val);
        	if( p.right != null) temp.push(p.right);
        	if(p.left != null) temp.push(p.left);
        }
        return ret;
    }
}
