public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return rec(root,0);
    }
    public int rec(TreeNode root, int last_level){
        if(root == null) return last_level;
        int left = rec(root.left,last_level + 1);
        int right = rec(root.right,last_level + 1);
        return left > right ? left : right;
    }
}
