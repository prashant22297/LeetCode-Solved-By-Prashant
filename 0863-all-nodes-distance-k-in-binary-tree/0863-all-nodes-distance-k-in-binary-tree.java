/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        rasta(root,target,list);
        int n = list.size();
        // System.out.println(list.toString());
        for(int i = 1;i<n;i++){
            TreeNode temp = list.get(i);
            if(i>k) break;
            if(i==k)ans.add(temp.val);
            else if(temp.left==list.get(i-1)){
                solve(temp.right,k-i-1,ans);
            }
            else solve(temp.left,k-i-1,ans);
        }
        
        solve(target,k,ans);
        
        return ans;
    }
    private void solve(TreeNode root, int dis, List<Integer> ans){
        if(root==null || dis<0) return;
        if(dis==0) {
            ans.add(root.val);
            return;
        }
        solve(root.left,dis-1,ans);
        solve(root.right,dis-1,ans);
    }
    
    private boolean rasta(TreeNode root, TreeNode target, ArrayList<TreeNode> list){
        if(root==null) return false;
        if(root == target) {
            list.add(target);
            return true;
        }
        boolean l = rasta(root.left,target,list);
        boolean r = rasta(root.right,target,list);
        if(l || r){
            list.add(root);
            return true;
        }
        else return false;
    }
}