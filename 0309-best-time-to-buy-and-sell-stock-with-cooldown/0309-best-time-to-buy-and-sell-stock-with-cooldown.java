class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, status = 0,temp=0,mx=0;
        // for(int i=0;i<n;i++){
        //     if(status == 0){
        //         temp=temp-prices[i];
        //         status=1;
        //     }
        //     else if(status == 1){
        //         temp=prices[i]+temp;
        //         status=2;
        //     }
        //     else status=0;
        //     mx=Math.max(mx,temp);---> skip buy nahi sell ,, cooldown
        // }
        // return mx;
        int[][] dp = new int[n][3];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(prices,0,0,n,dp);
    }
    public int solve(int[] prices,int i, int status,int n,int[][] dp){
        if(i==n) return 0;
        if(dp[i][status]!=-1) return dp[i][status];
        int temp=0;
        if(status==0){
            temp=-prices[i]+solve(prices,i+1,1,n,dp);
        }
        else if(status==1){
            temp=prices[i]+solve(prices,i+1,2,n,dp);
        }
        else {
            temp=solve(prices,i+1,0,n,dp);
        }
        
        int t = solve(prices,i+1,status,n,dp);
        return dp[i][status]=Math.max(t,temp);
    }
}