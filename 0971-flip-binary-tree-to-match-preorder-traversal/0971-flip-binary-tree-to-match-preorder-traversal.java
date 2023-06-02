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
        if(ans.contains(-1)){
            ans.clear();
            ans.add(-1);
            return ans;
        }
        return ans;
    }
//     private void swap(TreeNode root){
//         TreeNode temp=root.left;
//         root.left=root.right;
//         root.right=temp;
        
//     }
    private void solve(TreeNode root, int[] voyage){
        if(root==null) return;
        // ;
        System.out.println(root.val+" "+voyage[idx]);
        if(root.val!=voyage[idx++]){
            ans = new ArrayList<Integer>(Arrays.asList(-1));
            return;
        } 
        else if(root.val==voyage[idx-1] && root.left != null && root.left.val!=voyage[idx]){
            ans.add(root.val);
            // idx++;
            solve(root.right,voyage);
            solve(root.left,voyage);
        }
        else {
            // idx++;
            solve(root.left,voyage);
            solve(root.right,voyage);
        }
    }
}