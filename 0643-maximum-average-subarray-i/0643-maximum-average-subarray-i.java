class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int ans =Integer.MIN_VALUE;
        int j =0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(i>=k-1){
                ans=Math.max(ans,sum);
                sum-=nums[j];
                j++;
            }
        }
        return ans/(k*1.0);
    }
}