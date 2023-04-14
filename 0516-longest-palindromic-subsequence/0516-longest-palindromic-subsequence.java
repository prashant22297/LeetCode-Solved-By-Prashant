class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        // int i=0,j=n-1;
        for(int i=n;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i>j) dp[i][j]=0;
            else if(i==j) dp[i][j]=1;
            else if(s.charAt(i)==s.charAt(j)) dp[i][j]=2+dp[i+1][j-1];
            else dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
            
            }
        }
        return dp[0][n-1];
        // return solve(s,0,n,dp);
    }
//     int solve(String s, int i, int j,int dp[][]){
//         if(i==j) dp[i][j]=1;
//         if(i>j) dp[i][j]=0;
        
//         int ans=0;
//         if(s.charAt(i)==s.charAt(j)) dp[i][j] = Math.max(dp[i][j],2+solve(s,i+1,j-1));
        
//         return Math.max(ans, Math.max(solve(s,i+1,j),solve(s,i,j-1)));
//     }
}