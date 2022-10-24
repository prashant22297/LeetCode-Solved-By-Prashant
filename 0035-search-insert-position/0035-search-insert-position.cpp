class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        
        // O(N)
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]>=target)
        //         return i;
        // }
        // return nums.size();
        
//         O(LOG N)
        int l=0,h=nums.size()-1,mid=(l+h)/2;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return l;
    }
};