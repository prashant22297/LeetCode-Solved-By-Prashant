class Solution {
    int count;
    public int combinationSum4(int[] nums, int target) {
        count=0;
        int[] dp = new int[1001];
        Arrays.fill(dp,-1);
        return solve(nums,target,0,dp);
        // return count;
    }
    private int solve(int[] nums, int target, int curr,int[] dp){
        if(curr==target){
            return 1;
        }
        if(dp[curr]!=-1) return dp[curr];
        int ans=0;
        for(int i =0;i< nums.length;i++){
            int sum = curr+nums[i];
            if(sum<=target){
                ans=ans+solve(nums,target,sum,dp);
            }
        }
        dp[curr]=ans;
        return dp[curr];
    }
}