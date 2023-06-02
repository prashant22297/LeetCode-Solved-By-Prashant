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
    List<Integer> ans;
    int idx=0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        ans = new ArrayList<>();
        solve(root,voyage);
        return ans;
    }
    private void solve(TreeNode root, int[] voyage){
        if(root==null || (ans.size()!=0 && ans.get(0)==-1)) return;
        if(root.val!=voyage[idx++]){
            ans = new ArrayList<Integer>(Arrays.asList(-1));
            return;
        } 
        else if(root.val==voyage[idx-1] && root.left != null && root.left.val!=voyage[idx]){
            ans.add(root.val);
            solve(root.right,voyage);
            solve(root.left,voyage);
        }
        else {
            solve(root.left,voyage);
            solve(root.right,voyage);
        }
    }
}