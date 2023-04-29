class Solution {
    public int dominantIndex(int[] nums) {
        int mx=0,secmx=0,idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                secmx=mx;
                mx=nums[i];
                idx=i;
            }
            else if(nums[i]>secmx) secmx=nums[i];
        }
        if(mx>=secmx*2) return idx;
        return -1;
    }
}