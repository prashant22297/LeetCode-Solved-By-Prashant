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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
    public void solve(TreeNode root, int target,List<List<Integer>> ans,List<Integer> curr ){
        if(root==null) return;
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(target-root.val==0) ans.add(new ArrayList(curr));
        }
        
        solve(root.left,target-root.val,ans,curr);
        solve(root.right,target-root.val,ans,curr);
        curr.remove(curr.size()-1);
        return;
    }
}