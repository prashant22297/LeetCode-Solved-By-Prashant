class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int l =0;
        int r =n-1;
        while(l<n-1 && nums[l]<=nums[l+1]){
            l++;
        }
        if(l==r) return 0;
        while(r>0 && nums[r]>=nums[r-1]){
            r--;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            min= Math.min(min,nums[i]);
            max =Math.max(max,nums[i]);
        }
        
        while(l > 0 && min<nums[l-1]){
            l--;
            
        }
        while(r < n - 1 && max > nums[r+1]){
            r++;
        }

        return r - l + 1;
    }
}