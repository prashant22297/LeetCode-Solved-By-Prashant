class Solution {
    public int findMin(int[] nums) {
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]<nums[i-1]) return nums[i];
        // }
        // return nums[0];
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[end]) start=mid+1;
            else if(nums[mid]<nums[start]) end=mid;
            else end--;
        }
        return nums[start];
    }
}