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
    int idx = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        return solve(traversal,0);
    }
    private TreeNode solve(String s, int depth){
        int dash_count=0;
        while(idx+dash_count < s.length() && s.charAt(idx+dash_count)=='-') dash_count++;
        if(depth!=dash_count) return null;
        
        int temp_idx = 0;
        while(idx+dash_count+temp_idx < s.length() && s.charAt(idx+dash_count+temp_idx)!='-') temp_idx++;
        int value = Integer.parseInt(s.substring(idx+dash_count,idx+dash_count+temp_idx));
        idx = idx+dash_count+temp_idx;
        TreeNode root = new TreeNode(value);
        root.left=solve(s,depth+1);
        root.right = solve(s,depth+1);
        return root;
        
    }
    
}