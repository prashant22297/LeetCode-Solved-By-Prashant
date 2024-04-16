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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode temp = new TreeNode(val);
            temp.left=root;
            temp.right=null;
            return temp;
        }
        else{
            solve(root,val,depth,1);
        }
        return root;
    }
    private void solve(TreeNode root, int val,int depth, int currDepth){
        if(currDepth == depth-1){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left=left;
            root.right.right=right;
            return;
        }
        if(root.left!=null)
        solve(root.left,val,depth,currDepth+1);
        if(root.right!=null)
        solve(root.right,val,depth,currDepth+1);
    }
}