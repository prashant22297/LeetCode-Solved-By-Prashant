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
    int ans= Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        ans=Integer.MAX_VALUE;
        if(root == null ) return 0;
        solve(root,0);
        return ans;
    }
    private void solve(TreeNode root, int cur){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans=Math.min(ans,cur+1);
        }
        solve(root.left,cur+1);
        solve(root.right,cur+1);
    }
}