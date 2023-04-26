class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer dp[][][] = new Integer[m+1][n+1][strs.length];
        return solve(strs,m,n,0,dp);
    }
    public int solve(String[] strs, int m , int n, int i,Integer dp[][][]){
        if(i==strs.length) return 0;
        
        if(dp[m][n][i]!=null) return dp[m][n][i];
        int one=0;
        for(int j = 0;j<strs[i].length();j++){
            if(strs[i].charAt(j)=='1') one++;
        }
        int zero=strs[i].length()-one;
        
        if(zero<=m && one<=n) return dp[m][n][i]=Math.max(solve(strs,m-zero,n-one,i+1,dp)+1,solve(strs,m,n,i+1,dp));
        else return dp[m][n][i]=solve(strs,m,n,i+1,dp);
    }
}