class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // List<Integer> vis = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(0,nums.length,ans,new ArrayList<>(),nums,vis);
        return ans;
    }
    public void solve(int idx, int n, List<List<Integer>> ans, List<Integer> pro,int[] nums, boolean[] vis){
        if(idx == n){
            ans.add(new ArrayList<>(pro));
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                pro.add(nums[i]);
                solve(idx+1,n,ans,pro,nums,vis);
                pro.remove(pro.size()-1);
                vis[i]=false;
            }
        }
    }
}