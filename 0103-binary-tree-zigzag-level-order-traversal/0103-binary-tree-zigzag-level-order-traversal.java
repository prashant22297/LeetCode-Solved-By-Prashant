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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        int level=0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null)q.add(temp.right);
                list.add(temp.val);
            }
            if (level % 2 != 0)
                Collections.reverse(list);
            level++;
            ans.add(list);
        }
        return ans;
    }
}