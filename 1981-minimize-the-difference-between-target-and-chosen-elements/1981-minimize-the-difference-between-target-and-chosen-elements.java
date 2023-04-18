class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        Integer[][] dp = new Integer[72][5000];
        return solve(mat,0,0,target,m,n,dp);
    }
    public int solve(int[][] mat, int row, int sum, int target, int m, int n, Integer[][] dp){
        if(row==m) return Math.abs(sum-target);
        
        if(dp[row][sum]!=null) return dp[row][sum];
        
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            diff=Math.min(diff,solve(mat,row+1,sum+mat[row][i],target,m,n,dp));
            // if(!(sum+mat[row][i]-target>dp[row][sum])){
            // dp[row+1][sum+mat[row][i]]=solve(mat,row+1,sum+mat[row][i],target,m,n,dp);
            // diff=Math.min(diff,dp[row+1][sum+mat[row][i]]);
            // dp[row][sum]=diff;
            // }
        }
        
        return dp[row][sum]=diff;
    }
}