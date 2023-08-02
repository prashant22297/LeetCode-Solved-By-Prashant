class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(nums,ans,new ArrayList<>(),vis);
        return ans;
    }
    void solve(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] vis){
        if(curr.size()==nums.length){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]==false){
                curr.add(nums[i]);
                vis[i]=true;
                solve(nums,ans,curr,vis);
                curr.remove(curr.size()-1);
                vis[i]=false;
            }
        }
    }
}