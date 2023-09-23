class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int ans=0,left =0, right = 0;
        int pro = 1;
        int len = nums.length;
        while(right<len){
            pro*=nums[right];
            while(left<right && pro>=k)
                pro=pro/nums[left++];
            if(pro<k)
                ans+=right-left+1;
            right++;
        }
        return ans;
    }
}