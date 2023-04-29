class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        return solve(s,0,dp);
    }
    public int solve(String s, int i,int[] dp){
        if(s.length()==i) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=0) return dp[i];
        int a = solve(s,i+1,dp);
        int b = 0;
        if(i<s.length()-1 && Integer.parseInt(s.substring(i,i+2)) <= 26){
            b=solve(s,i+2,dp);
        }
        return dp[i] = a+b;
    }
}