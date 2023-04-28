class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    public int solve(int[] nums, int target, int idx, int sum){
        if(nums.length==idx){
            if(sum==target) return 1;
            else return 0;
        }
        return solve(nums,target,idx+1,sum-nums[idx])+solve(nums,target,idx+1,sum+nums[idx]);
    }
}