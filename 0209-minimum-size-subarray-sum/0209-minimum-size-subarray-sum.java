class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,sum=0,ans=Integer.MAX_VALUE,j=0;
        while(i<nums.length){
            sum+=nums[i++];
            while(sum>=target){
                ans=Math.min(i-j,ans);
                sum-=nums[j++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}