class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int mx =1;
        dp[0]=1;
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],1+dp[j]);
            }
            mx=Math.max(mx,dp[i]);
        }
        return mx;
    }
}