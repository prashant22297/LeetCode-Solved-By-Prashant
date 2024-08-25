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
    List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        solve(root);
        return ans;
    }
    public void solve(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            solve(root.left);
        }
        if(root.right!=null){
            solve(root.right);
        }
        ans.add(root.val);
    }
}