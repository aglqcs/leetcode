package leetcode;

public class max_depth {
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        if(root.left != null)
            left = 1 + maxDepth(root.left);
        if(root.right != null)
            right = 1 + maxDepth(root.right);
        return Math.max(left,right);
    }
}
