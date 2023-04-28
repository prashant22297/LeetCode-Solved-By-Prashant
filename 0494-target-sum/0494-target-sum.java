class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Integer[][] dp = new Integer[nums.length+1][2002];
        return solve(nums,1000+target,0,1000,dp);
    }
    public int solve(int[] nums, int target, int idx, int sum,Integer[][] dp){
        if(dp[idx][sum]!=null) return dp[idx][sum];
        if(nums.length==idx){
            if(sum==target) return 1;
            else return 0;
        }

        return dp[idx][sum]=solve(nums,target,idx+1,sum+nums[idx],dp)+solve(nums,target,idx+1,sum-nums[idx],dp);
    }
}