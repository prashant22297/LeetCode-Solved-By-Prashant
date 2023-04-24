class Solution {
    public int change(int amount, int[] coins) {
        Integer dp[][] = new Integer[coins.length][amount+1];
        return solve(amount,0,coins,dp);
    }
    public int solve(int amount, int idx, int[] coins,Integer[][] dp){
        if(amount==0) return 1;
        if(idx>=coins.length || amount<0) return 0;
        if(dp[idx][amount]!=null) return dp[idx][amount];
        
        int ans=0;
        for(int i=idx;i<coins.length;i++){
            ans+=solve(amount-coins[i],i,coins,dp);
        }
        return dp[idx][amount]=ans;
    }
}