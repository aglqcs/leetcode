package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node {
	public static class TreeLinkNode{
		int val;
		TreeLinkNode left;
	    TreeLinkNode right;
	    TreeLinkNode next;
	    TreeLinkNode(int a){
	    	val = a;
	    }
	}
	public static void main(String[] args){
		TreeLinkNode a = new TreeLinkNode(1);
		TreeLinkNode b = new TreeLinkNode(2);
		TreeLinkNode c = new TreeLinkNode(3);
		a.left = b;
		a.right = c;
		connect(a);
	}
	public static void connect(TreeLinkNode root) {
		if(root == null){
			return;
		}
		ArrayList<TreeLinkNode> p1 = new ArrayList<TreeLinkNode>();
		ArrayList<TreeLinkNode> p2 = new ArrayList<TreeLinkNode>();
		
		boolean use_p1 = true;
		p1.add(root);
		while( !p1.isEmpty() || !p2.isEmpty()){
			if( use_p1 ){
				for(int i = 0;i < p1.size() - 1;i ++){
					p1.get(i).next = p1.get(i + 1);
				}
				for(int i = 0;i < p1.size();i ++){
					if(p1.get(i).left != null && p1.get(i).right != null){
					p2.add(p1.get(i).left);
					p2.add(p1.get(i).right);
					}
				}
				use_p1 = false;
				p1.clear();
			}
			else{
				for(int i = 0;i < p2.size() - 1;i ++){
					p2.get(i).next = p2.get(i + 1);
				}
				for(int i = 0;i < p2.size();i ++){
					if(p2.get(i).left != null && p2.get(i).right != null){
						p1.add(p2.get(i).left);
						p1.add(p2.get(i).right);
					}
				}
				use_p1 = true;
				p2.clear();
			}
		}
    }
}
