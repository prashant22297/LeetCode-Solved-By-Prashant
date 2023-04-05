class Solution {
    public int minimizeArrayValue(int[] nums) {
        long ans=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum%(i+1)==0) ans=Math.max(ans,sum/(i+1));
            else ans=Math.max(ans,1+sum/(i+1));
        }
        return (int)ans;
    }
}