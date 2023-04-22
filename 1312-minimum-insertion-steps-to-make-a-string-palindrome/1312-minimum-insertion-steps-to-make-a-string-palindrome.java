class Solution {
    public int minInsertions(String s) {
        String r =new StringBuilder(s).reverse().toString();
        int m = s.length();
        int[][] dp = new int[m][m];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return s.length()-lcs(s,r,m-1,m-1,dp);
    }
    public int lcs(String s, String r, int m, int n,int[][] dp){
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s.charAt(m)==r.charAt(n)){
            return dp[m][n]=1+lcs(s,r,m-1,n-1,dp);
        }
        else return dp[m][n]=Math.max(lcs(s,r,m-1,n,dp),lcs(s,r,m,n-1,dp));
    }
}