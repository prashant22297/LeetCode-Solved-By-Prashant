class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int mx = Integer.MIN_VALUE,ans=0,level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int tempSum=0;
            level++;
            for(int i=0;i<size;i++){
                TreeNode cur = q.remove();
                tempSum+=cur.val;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(tempSum>mx){
                mx=tempSum;
                ans=level;
            }
        }
        return ans;
    }
}