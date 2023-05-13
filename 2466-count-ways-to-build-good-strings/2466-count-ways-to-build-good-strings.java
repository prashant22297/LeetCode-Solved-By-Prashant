class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[] = new int[high+1];
        Arrays.fill(dp,-1);
        int mod = 1000000007;
        return solve(low,high,zero,one,0,dp,mod);
    }
    public int solve(int low, int high, int zero, int one, int i, int dp[],int mod){
        if(i>high) return 0;
        if(dp[i]!=-1) return dp[i];
        int temp=0;
        if(i>=low && i<=high) temp=1;
        dp[i]= temp;
        int a=solve(low,high,zero,one,i+zero,dp,mod);
        int b=solve(low,high,zero,one,i+one,dp,mod);
        return dp[i]=(dp[i]+a+b)%mod;
    }
}