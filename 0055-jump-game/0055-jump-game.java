class Solution {
    
    public boolean canJump(int[] nums) {
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i>ans) return false;
        //     ans=Math.max(ans,i+nums[i]);
        // }
        // return true;
        if(nums.length==1) return true;
        Boolean[] dp = new Boolean[nums.length];
        // Arrays.fill(dp,false);
        return solve(nums,0,nums.length-1,dp);
    }
    public boolean solve(int[] nums, int first, int last,Boolean[] dp){
        if(first>=last) return dp[first]=true;
        if(dp[first] != null) return dp[first];
        // boolean temp=false;
        for(int i=1;i<=nums[first];i++){
            // temp=solve(nums,first+i;last);
            if(solve(nums,first+i,last,dp) == true) return dp[first]=true;
        }
        return dp[first]=false;
    }
}