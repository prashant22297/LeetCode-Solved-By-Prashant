class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
    //     int post=0,ans=0;
    //     for(int i=satisfaction.length-1;i>=0; i--){
    //         post +=satisfaction[i];
    //         if(post>=0) ans+=post;
    //     }
    //     return ans;
        int n = s.length;
        int [][] dp = new int[n+1][n+1];
        for(int [] a : dp){
             Arrays.fill(a, -1);
         }
        return solve(n,s,0,0,dp);
    }
    public int solve(int n, int[] s, int i , int time, int[][] dp){
        if(i==n) return 0;
        if(dp[i][time]!=-1) return dp[i][time];
         return dp[i][time] = Math.max(
             (s[i]*(time+1)+solve(n,s,i+1,time+1,dp))
                                       ,solve(n,s,i+1,time,dp));
    }
}