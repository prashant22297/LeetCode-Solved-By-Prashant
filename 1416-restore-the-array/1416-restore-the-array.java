class Solution {
    int mod = 1000000007;
    public int numberOfArrays(String s, int k) {
        Integer[] dp = new Integer[s.length()];
        return solve(s,k,0,dp);
    }
    public int solve(String s, int k, int idx,Integer[] dp){
        if(s.length()==idx) return 1;
        if(s.charAt(idx)=='0') return 0;
        if(dp[idx]!=null) return dp[idx];
        int ans=0;
        long num=0;
        for(int i = idx;i<s.length();i++){
            num=num*10+(s.charAt(i)-'0');
            // System.out.println(num);
            if(num>k) break;
            ans+=solve(s,k,i+1,dp);
            ans%=mod;
        }
        return dp[idx]=ans;
    }
}