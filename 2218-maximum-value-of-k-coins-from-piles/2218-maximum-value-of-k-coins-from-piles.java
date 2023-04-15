class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        int[][] dp = new int[n+1][k+1];
        
        return solve(n,0,k,piles,dp);
    }
    
    public int solve(int n, int i, int k , List<List<Integer>> piles, int[][] dp){
        if(dp[i][k]>0) return dp[i][k];
        if(i==n || k==0) return 0;
        int ans = 0,temp_sum=0;
        ans = solve(n,i+1,k,piles,dp);
        for(int j=0;j<piles.get(i).size() && j<k;j++){
            temp_sum+=piles.get(i).get(j);
            ans=Math.max(ans,solve(n,i+1,k-j-1,piles,dp)+temp_sum);
        }
        dp[i][k]=ans;
        return ans;
    }
}