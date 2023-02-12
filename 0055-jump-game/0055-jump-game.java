class Solution {
    
    public boolean canJump(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i>ans) return false;
            ans=Math.max(ans,i+nums[i]);
        }
        return true;
        // static boolean[] dp = new boolean[100000+1];
        // return solve(nums,0,nums.length-1);
    }
    // public boolean solve(int[] nums, int first, int last){
    //     if(first>=last) return true;
    //     if(dp[first] == true) return true;
    //     // boolean temp=false;
    //     for(int i=1;i<=nums[first];i++){
    //         // temp=solve(nums,first+i;last);
    //         if(solve(nums,first+i,last) == true) return dp[first]=true;
    //     }
    //     return dp[first]=false;
    // }
}