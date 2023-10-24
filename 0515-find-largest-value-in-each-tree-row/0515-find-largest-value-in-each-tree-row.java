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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = q.remove();
                mx = Math.max(mx,temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            ans.add(mx);
        }
        return ans;
    }
}