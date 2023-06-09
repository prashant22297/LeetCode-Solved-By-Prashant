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
    boolean ans=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        solve(root,subRoot);
        return ans;
    }
    
    private void solve(TreeNode root, TreeNode subRoot){
        if(root==null) return;
        if(root.val == subRoot.val && ans==false) {
            ans = solve1(root,subRoot);
        }
        solve(root.left,subRoot);
        solve(root.right,subRoot);
        return;
    }
    private boolean solve1(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val == subRoot.val){
             return solve1(root.left,subRoot.left) && solve1(root.right,subRoot.right);
        }
        return false;
    }
}