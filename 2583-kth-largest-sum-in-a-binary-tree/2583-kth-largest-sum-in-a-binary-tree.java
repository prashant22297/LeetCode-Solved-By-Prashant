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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<Long>(Collections.reverseOrder());
        if(root==null) return 0;
        int mx = Integer.MIN_VALUE,level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            long tempSum=0;
            level++;
            for(int i=0;i<size;i++){
                TreeNode cur = q.remove();
                tempSum+=cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            pq.add(tempSum);
        }
        while(!pq.isEmpty() && k>1){
            k--;
            pq.poll();
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return -1;
    }
}