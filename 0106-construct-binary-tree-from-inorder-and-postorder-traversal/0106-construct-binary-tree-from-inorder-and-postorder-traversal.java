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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return solve(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    
    private TreeNode solve(int[] in,int is, int ie, int[] post,int ps, int pe){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(post[pe]);
        int i_pos=0;
        for(int i=0;i<in.length;i++){
            if(in[i]==post[pe]){
                i_pos=i;
                break;
            }
        }
        int t_ele  = i_pos-is;
        root.left = solve(in,is,i_pos-1,post,ps,ps+t_ele-1);
        root.right = solve(in,i_pos+1,ie,post,ps+t_ele,pe-1);
        return root;
        
        
    }
}