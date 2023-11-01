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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer>map=new HashMap<>();

        traverse(root,map);
        int ans=-1111;
        for (Map.Entry<Integer,Integer>entry:map.entrySet())
        {
              if(entry.getValue()>ans)
              {
                  ans=entry.getValue();
              }
        }

       

        ArrayList<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==ans)
            {
                list.add(entry.getKey());
            }
        }
        int c=0;
        int ansA[]=new int[list.size()];
        for(int v:list)
        {
            ansA[c++]=v;
        }
        return ansA;
    }
    void traverse(TreeNode root,Map<Integer,Integer>map)
    {
        if(root==null)return;

        map.put(root.val,map.getOrDefault(root.val,0)+1);
        traverse(root.left,map);
        traverse(root.right,map);
    }
}