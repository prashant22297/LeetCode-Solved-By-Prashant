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
    int mxfreq=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        solve(root,mp);
        int count=0;
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            Integer sum = i.getKey();
            Integer fre = i.getValue();
            if(fre==mxfreq){
                count++;
            }
        }
        int freq[] = new int[count];
        int j=0;
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            Integer sum = i.getKey();
            Integer fre = i.getValue();
            if(fre==mxfreq){
                freq[j++]=sum;
            }
        }
        return freq;
    }
    private int solve(TreeNode root, HashMap<Integer,Integer> mp){
        if(root==null) return 0;
        int left = solve(root.left, mp);
        int right = solve(root.right,mp);
        mp.put(left+right+root.val,mp.getOrDefault(left+right+root.val,0)+1);
        mxfreq=Math.max(mxfreq,mp.get(left+right+root.val));
        return root.val+left+right;
    }
}