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
    int ans=0;
    public int distributeCoins(TreeNode root) {
        solve(root);
        return ans;
    }
    private int solve(TreeNode root){
        if(root==null) return 0;
        int temp = solve(root.left)+solve(root.right)+root.val-1;
        ans+=Math.abs(temp);
        return temp;
    }
}