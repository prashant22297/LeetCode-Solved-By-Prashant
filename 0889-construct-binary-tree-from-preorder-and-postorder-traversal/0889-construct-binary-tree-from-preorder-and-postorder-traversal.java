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
    int idx=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        idx=0;
        for(int i=0;i<postorder.length;i++)
            hm.put(postorder[i],i);
        return solve(preorder, postorder,hm,0,postorder.length-1);
    }
    
    private TreeNode solve(int[] pre, int[] post, HashMap<Integer, Integer> hm , int start, int end){
        if(start>end) return null;
        TreeNode root= new TreeNode(pre[idx++]);
        if(start==end) return root;
        int postIdx = hm.get(pre[idx]);
        root.left = solve(pre,post,hm,start,postIdx);
        root.right = solve(pre, post, hm , postIdx+1, end-1);
        return root;
    }
}