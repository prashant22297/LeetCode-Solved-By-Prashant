class Solution {
    public boolean canPartition(int[] nums) {
        int sumAll=0;
        int n = nums.length;
        for(int i: nums){
            sumAll+=i;
        }
        if(sumAll%2==0){
            int sum =sumAll/2;
            boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0) dp[i][j]=false;
                if(j==0) dp[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
        }
        else return false;
    }
}