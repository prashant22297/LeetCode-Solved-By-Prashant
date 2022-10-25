class Solution {
public:
    int findP(int l, int h, vector<int>& nums){
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]>nums[m+1]) return m;
            else if(nums[l]>nums[m]) h=m-1;
            else l=m+1;
        }
        return l;
    }
     int solve(vector<int>& arr, int start, int end,int target){
        while(start<=end){
            int mid= start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        // Method 1 --> Finding the pivot and than finding the values in one the part
        // int pivot=0;
        // for(int i=1;i<nums.size();i++){
        //     if(nums[i-1]>nums[i]){
        //         pivot=i;
        //         break;
        //     }
        // }
        // int l,h,m;
        // if(pivot>0 && target>=nums[0] && target<=nums[pivot-1]){
        //     l=0;
        //     h=pivot-1;
        // }
        // else {
        //     l=pivot;
        //     h=nums.size()-1;
        // }
        // while(l<=h){
        //     m=l+(h-l)/2;
        //     if(nums[m]==target) return m;
        //     else if(nums[m]>target) h=m-1;
        //     else l=m+1;
        // }
        // return -1;
        // Method 2 -. finding the pivot using BS and than searhing in both part using BS
        int n=nums.size();
        int l=0,h=n-1;
        int k = findP(l,h,nums);
        int one=solve(nums,l,k,target);
        int two=solve(nums,k+1,h,target);
        
        return one==-1?two:one;
    }
};