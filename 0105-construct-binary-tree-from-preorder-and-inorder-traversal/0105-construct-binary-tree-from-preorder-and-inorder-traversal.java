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
    int in=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder,0,preorder.length-1);
    }
    
    private TreeNode solve(int[] preorder, int[] inorder, int l, int r){
        if(in == preorder.length || l>r) return null;
        
        TreeNode root = new TreeNode(preorder[in]);
        for(int i=l;i<=r;i++){
            if(preorder[in]==inorder[i]){
                in++;
                
                root.left=solve(preorder,inorder,l,i-1);
                root.right = solve(preorder,inorder,i+1,r);
                break;
            }
        }
        return root;
    }
}