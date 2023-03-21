class Solution {
    public int findMin(int[] nums) {
        int s=0,e=nums.length-1,mid;
        while(s<e){
            mid =s+(e-s)/2;
            if(nums[mid]>nums[mid+1]) return nums[(mid+1)%nums.length];
            else if(nums[mid]<nums[s]){
                e=mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return nums[(s+1)%nums.length];
    }
}