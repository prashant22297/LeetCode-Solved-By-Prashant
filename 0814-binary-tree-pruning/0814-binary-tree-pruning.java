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
    public TreeNode pruneTree(TreeNode root) {
        solve(root);
        if(root.val==0 && (root.left==null && root.right==null))
            root=null;
        return root;
    }
    private int solve(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0,solve(root.left));
        int right = Math.max(0,solve(root.right));
        if(left<=0) root.left=null;
        if(right<=0) root.right=null;
        return root.val+Math.max(0,Math.max(left,right));
    }
}