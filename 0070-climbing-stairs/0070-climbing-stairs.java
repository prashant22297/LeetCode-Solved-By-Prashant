class Solution {
    
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        return solve(n,dp);
        // if(n==0 || n==1) return 1;
        // return dp[n]=climbStairs(n-1)+climbStairs(n-2);
        
    }
    public int solve(int n, int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]= solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
}