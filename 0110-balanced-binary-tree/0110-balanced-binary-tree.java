/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int ans = solve(root,0);
        if(ans==-1) return false;
        return true;
    }
    private int solve(TreeNode root, int height){
        if(root==null) return 0;
        int l = solve(root.left,height);
        int r = solve(root.right,height);
        if(l == -1 || r == -1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }
}