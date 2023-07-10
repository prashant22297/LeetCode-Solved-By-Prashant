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
    int ans;
    public int minDepth(TreeNode root) {
        ans=0;
        return solve(root);
    }
    private int solve(TreeNode root){
        if(root==null) return 0;
        if(root.left == null && root.right == null)
            return 1;
        int left = solve(root.left);
        int right = solve(root.right);
        if(root.left == null || root.right == null ){
            return 1+Math.max(left,right);
        }
        // if(root.right == null){
        //     return 1+left;
        // }
        return 1+Math.min(left,right);
    }
}