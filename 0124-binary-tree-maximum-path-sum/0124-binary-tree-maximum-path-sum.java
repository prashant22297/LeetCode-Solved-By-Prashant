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
    int mx_sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // if(root.left==null && root.right==null) return root.val;
        solve(root);
        return mx_sum;
    }
    private int solve(TreeNode root){
        if(root==null) return 0;
        // curr+=root.val;
        int left = Math.max(0,solve(root.left));
        int right = Math.max(0,solve(root.right));
        mx_sum=Math.max(mx_sum,left+right+root.val);
        return root.val+Math.max(left,right);
    }
}