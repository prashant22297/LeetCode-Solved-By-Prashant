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
    Integer temp = null;
    int ans = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root==null) return ans;
        minDiffInBST(root.left);
        if(temp!=null) ans = Math.min(ans,root.val-temp);
        temp=root.val;
        minDiffInBST(root.right);
        return ans;
    }
}