class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
        int totalsum=0;
        int maxsum=nums[0];    
        int minsum=nums[0];    
        int curmax=0;
        int curmin=0;
        for(int el:nums)
        {
            curmax=Math.max(curmax+el,el);
            maxsum=Math.max(maxsum,curmax);
            curmin=Math.min(curmin+el,el);
            minsum=Math.min(minsum,curmin);
            totalsum+=el;
        }
        return maxsum>0?Math.max(maxsum,totalsum-minsum):maxsum;
    }
}