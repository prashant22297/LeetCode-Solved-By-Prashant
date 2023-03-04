class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int minidx =-1,maxidx=-1,j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                j=i;                
            }
            if(nums[i]==minK)
                minidx=i;
            if(nums[i]==maxK)
                maxidx=i;
            ans+=Math.max(0,Math.min(minidx,maxidx)-j);
        }
        return ans;
    }
}