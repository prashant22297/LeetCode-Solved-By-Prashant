class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int mx = days[days.length-1];
        Set<Integer> yes = new HashSet<>();
        for (int day : days) {
            yes.add(day);
        }
        for (int i = 1; i <= mx; i++) {
            if (yes.contains(i)) 
                dp[i] = Math.min(dp[i-1] + costs[0], Math.min(dp[Math.max(0, i-7)] + costs[1], dp[Math.max(0, i-30)] + costs[2]));
            else dp[i] = dp[i-1];
        }
        return dp[mx];
    }
}