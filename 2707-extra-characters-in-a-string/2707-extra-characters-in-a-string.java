class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dic = new HashSet<>();
        for(String ss: dictionary){
            dic.add(ss);
        }
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(0,s,dic,dp);
    }
    
    public int solve(int idx, String s, Set<String> dic,int[] dp){
        if(idx == s.length())
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int ans = 51;
        for(int i=idx;i<s.length();i++){
            String str = s.substring(idx,i+1);
            if(dic.contains(str)) 
                ans = Math.min(ans,solve(i+1,s,dic,dp));
            else
                ans = Math.min(ans,solve(i+1,s,dic,dp)+i-idx+1);
        }
        return dp[idx]=ans;
    }
}