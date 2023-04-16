class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        return solve(1,1,m,n,dp);
    }
    public int solve(int i,int j,int m, int n,int dp[][]){
        if(i==m && j==n) return 1;
        if(i>m || j>n) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int ans=0;
        dp[i][j]=solve(i+1,j,m,n,dp)+solve(i,j+1,m,n,dp);
        return dp[i][j];
    }
}