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
    public int goodNodes(TreeNode root) {
        return solve(root,root.val);
    }
    private int solve(TreeNode root, int mx){
        if(root==null) return 0;
        int ans=0;
        if(root.val>=mx){
            ans=1;
            mx=root.val;
        }
        return ans+solve(root.left,mx)+solve(root.right,mx);
    }
}