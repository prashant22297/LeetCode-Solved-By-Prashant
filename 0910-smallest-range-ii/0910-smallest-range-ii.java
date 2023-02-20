class Solution {
    public int smallestRangeII(int[] nums, int k) {
        if(nums.length==1) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[n-1]-nums[0];
        
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int mi = Math.min(nums[0]+k,nums[j]-k);
            int ma = Math.max(nums[n-1]-k,nums[j-1]+k);
            ans = Math.min(ans,ma-mi);
        }
        return ans;
    }
}