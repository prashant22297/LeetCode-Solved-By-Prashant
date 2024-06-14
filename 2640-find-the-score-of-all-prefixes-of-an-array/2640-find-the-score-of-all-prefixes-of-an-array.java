class Solution {
    public long[] findPrefixScore(int[] nums) {
        long currMax = Integer.MIN_VALUE;
        int n = nums.length;
        long[] conver = new long[n];
        long[] ans = new long[n];
        for(int i =0;i<n;i++){
            if(nums[i]>currMax)
                currMax=nums[i];
            conver[i]=nums[i]+currMax;
        }
        ans[0]=conver[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+conver[i];
        }
        return ans;
    }
}