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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root, ans, "");
        return ans;
    }
    public void solve(TreeNode root, List<String> ans,String curr){
        if(root==null) return;
        curr=curr+root.val;
        if(root.left==null && root.right== null){
            ans.add(curr);
            return;
        }
        curr+="->";
        solve(root.left,ans,curr);
        solve(root.right,ans,curr);
    }
}