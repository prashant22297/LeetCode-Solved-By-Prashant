class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        }
    
    int search(int[] nums, int target, boolean searchleft){
        int ans=-1;
        int start = 0;
            int end = nums.length-1;
            int mid = start+(end-start)/2;
            while(start<=end){
                mid = start+(end-start)/2;
                if(target<nums[mid]){
                    end = mid-1;
                }
                else if(target>nums[mid]){
                    start = mid+1;
                }
                else{
                    ans=mid;
                    if(searchleft){
                        end=mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
            }
        return ans;
    }
}