class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[m+1][n+1][strs.length];
        return solve(strs, m, n, 0,dp);
    }
    public int solve(String[] strs, int m, int n, int idx,int[][][] dp){
        if(idx==strs.length) return 0;
        if(dp[m][n][idx]!=0) return dp[m][n][idx];
        int zero=0, one=0;
        for(int i=0;i<strs[idx].length();i++){
            if(strs[idx].charAt(i)=='0') zero++;
        }
        one=strs[idx].length()-zero;
        if(m-zero>=0 && n-one>=0){
            return dp[m][n][idx] = Math.max(solve(strs,m-zero,n-one,idx+1,dp)+1,solve(strs,m,n,idx+1,dp));
        }
        else return dp[m][n][idx] = solve(strs,m,n,idx+1,dp);
    }
}