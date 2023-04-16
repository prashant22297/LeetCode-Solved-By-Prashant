class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
     int dp[][] = new int[m+1][n+1];
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return 0;
        return solve(0,0,m-1,n-1,dp,grid);
    }
    public int solve(int i,int j,int m, int n,int dp[][],int[][] grid){
        if(i==m && j==n && grid[m][n]!=1) return 1;
        if(i>m || j>n) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int ans=0;
        if(i+1<=m && grid[i+1][j]==0)
            ans+=solve(i+1,j,m,n,dp,grid);
        if(j+1<=n && grid[i][j+1]==0)
            ans+=solve(i,j+1,m,n,dp,grid);
        
        dp[i][j]=ans;
        return dp[i][j];
    }
}