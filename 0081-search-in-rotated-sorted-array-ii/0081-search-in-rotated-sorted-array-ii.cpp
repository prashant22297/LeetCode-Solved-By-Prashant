class Solution {
public:
    bool search(vector<int>& nums, int target) {
         // Method 1 --> Finding the pivot and than finding the values in one the part
        int pivot=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]>nums[i]){
                pivot=i;
                break;
            }
        }
        int l,h,m;
        if(pivot>0 && target>=nums[0] && target<=nums[pivot-1]){
            l=0;
            h=pivot-1;
        }
        else {
            l=pivot;
            h=nums.size()-1;
        }
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]==target) return true;
            else if(nums[m]>target) h=m-1;
            else l=m+1;
        }
        return false;
        // int l=0,h=nums.size()-1,m;
        // while(l<=h){
        //     m=l+(h-l)/2;
        //     if(nums[m]==target) return true;
        //     // left is sorted
        //     if(nums[l]<=nums[m]){
        //         if(target >= nums[l] && target <= nums[m])h=m-1;
        //         else l=m+1;
        //     }
        //     else if(nums[m]<=nums[h]){
        //         if(target >= nums[m] && target <= nums[h]) l=m+1;
        //         else h=m-1;
        //     }
        // }
        // return false;  
    }
};