class Solution {
    public int maxSubArray(int[] nums) {
        int sum =Integer.MIN_VALUE,msf=0;
        for(int i=0;i<nums.length;i++){
            if(msf<nums[i] && msf<0){
                msf=nums[i];
            }
            else msf+=nums[i];
            sum=Math.max(sum,msf);
        }
        return sum;
    }
}