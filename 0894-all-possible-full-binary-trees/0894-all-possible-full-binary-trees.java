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
    
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans = new ArrayList<>();
        // if(n<=0) return null;
        // List<TreeNode> t = new ArrayList<>();
        if(n==1) {
            List<TreeNode> t = new ArrayList<>();
            t.add(new TreeNode(0));
            return t;
        }
        for(int i=1;i<n;i+=2){
            List<TreeNode> left =allPossibleFBT(i);
            List<TreeNode> right =allPossibleFBT(n-i-1);
            // if(left!=null && right!=null){
                for(TreeNode l: left){
                    for(TreeNode r: right){
                        TreeNode temp = new TreeNode(0);
                        temp.left=l;
                        temp.right=r;
                        ans.add(temp);
                    }
                }
            // }
        }
        return ans;
    }
}