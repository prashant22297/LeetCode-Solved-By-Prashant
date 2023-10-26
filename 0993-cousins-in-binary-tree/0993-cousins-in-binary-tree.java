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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> sameLevel = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.remove();
                if(temp.left!=null && temp.right!=null){
                    if(temp.left.val==x && temp.right.val==y) return false;
                    if(temp.left.val==y && temp.right.val==x) return false;
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                sameLevel.add(temp.val);
            }
            if(sameLevel.contains(x) && sameLevel.contains(y)) return true;
        }
        return false;
    }
}