class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp = new int[n];
        return solve(arr,k,0,n,dp);
    }
    public int solve(int[] arr, int k ,int i, int n,int[] dp){
        if(i==n) return 0;
        if(dp[i]!=0) return dp[i];
        int max_value=0, max_sum=0,len=0;
        for(int j=i;j<Math.min(n,i+k);j++){
            len++;
            max_value=Math.max(max_value,arr[j]);
            int temp_sum=(len*max_value)+solve(arr,k,j+1,n,dp);
            max_sum=Math.max(max_sum,temp_sum);
        }
        return dp[i]=max_sum;
    }
}