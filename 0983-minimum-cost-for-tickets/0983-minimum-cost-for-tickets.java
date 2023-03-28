class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int mx = days[days.length-1];
        int[] dp = new int[mx+1];
        int j=0;
        for (int i=1; i<=mx; i++) {
            if (days[j]==i){ 
                dp[i] = Math.min(dp[i-1] + costs[0], Math.min(dp[Math.max(0, i-7)] + costs[1], dp[Math.max(0, i-30)] + costs[2]));
                j++;
            }
            else dp[i]=dp[i-1];
        }
        return dp[mx];
    }
}