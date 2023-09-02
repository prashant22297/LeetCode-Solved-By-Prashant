class Solution {
    static Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
//         if(s.length()==0) return true;
        
//         String temp = "";
//         int i=0;
        
//         for(;i<=s.length();i++){
//             temp+=s.charAt(i);
//             if(dp[i]==true) return dp[i];
//             else if(dp[i]!=true && wordDict.contains(temp)){
//                 // System.out.println(s.substring(i+1));
//                   dp[i+1]=wordBreak(s.substring(i+1),wordDict);
//             }
//             // else dp[i]=wordBreak(s,wordDict);
//             // return wordBreak(s,wordDict);
//         }
//         // if(dp[i]==true) return dp[i];
//         // if(i==s.length()) return false;
//         // return false;
//         return dp[s.length()-1];
        return solve(0,s,wordDict);
    }
    public boolean solve(int idx, String s, List<String> wordDict){
        if(idx==s.length()) return true;
        if(dp[idx]!=null) return dp[idx];
        for(int i=idx;i<s.length();i++){
            if(wordDict.contains(s.substring(idx,i+1)) && solve(i+1,s,wordDict)) return dp[idx]=true;
        }
        return dp[idx]=false;
    }
    
}