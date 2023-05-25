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
    public int deepestLeavesSum(TreeNode root) {
        int mx = mxDepth(root);
        solve(root,mx,1);
        return ans;
    }
    private int mxDepth(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return 1+Math.max(mxDepth(root.left),mxDepth(root.right));
    }
    private void solve(TreeNode root, int mx,int lvl){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(mx==lvl)
                ans=ans+root.val;
            return;
        }
        solve(root.left,mx,lvl+1);
        solve(root.right,mx,lvl+1);
        return;
    }
}