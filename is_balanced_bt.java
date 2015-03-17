package leetcode;

public class is_balanced_bt {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if( Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.right == null && root.left != null)
            return 1 + height(root.left);
        if(root.left == null && root.right != null)
            return 1 + height(root.right);
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
