/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        System.out.println(target.val);
        return solve(original,cloned,target);

    }
    
    private final TreeNode solve(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || cloned == null) return null;
        if(target==original){
            return cloned;
        }
        TreeNode a = solve(original.left,cloned.left,target);
        TreeNode b = solve(original.right,cloned.right,target);
        if(a!=null) return a;
        else return b;
    }
}