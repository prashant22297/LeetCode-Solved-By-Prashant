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
    long product=1;
    public int maxProduct(TreeNode root) {
        long total_sum = total(root);
        int sub_sum = solve(root,total_sum);
        return (int)(product%1000000007);
    }
    private int solve(TreeNode root, long total_sum){
        if(root==null) return 0;
        int left = solve(root.left,total_sum);
        int right = solve(root.right,total_sum);
        long p1 = (Math.abs(total_sum-left)%1000000007)*(left%1000000007);
        long p2 = (Math.abs(total_sum-right)%1000000007)*(right%1000000007);
        // long p = Math.abs(total_sum-left)>Math.abs(total_sum-right)?Math.abs(total_sum-left)*left:Math.abs(total_sum-right)*right;
        product = Math.max(product,Math.max(p1,p2));
        
        return left+right+root.val;
    }
    private long total(TreeNode root){
        if(root==null) return 0;
        return total(root.left)+total(root.right)+root.val;
    }
}