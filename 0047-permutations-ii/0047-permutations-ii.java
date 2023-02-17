class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> viss = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        boolean[] vis = new boolean[nums.length];
        solve(0,nums.length,ans,new ArrayList<>(),nums,vis);
        for(List i : ans){
            viss.add(new ArrayList<>(i));
        }
        return viss;
    }
    public void solve(int idx, int n, Set<List<Integer>> ans, List<Integer> pro,int[] nums, boolean[] vis){
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