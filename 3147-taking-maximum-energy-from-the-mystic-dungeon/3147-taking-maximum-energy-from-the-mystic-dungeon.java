class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int ans=Integer.MIN_VALUE;
        int n = energy.length;
        int[] dp = new int[n];
        for(int i=n-1;i>=0;i--){
            if(i+k<n) dp[i]=dp[i+k]+energy[i];
            else dp[i]=energy[i];
        }
        for(int i:dp) ans=Math.max(ans,i);
        return ans;
    }
}