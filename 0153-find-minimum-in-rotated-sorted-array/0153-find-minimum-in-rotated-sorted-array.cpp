class Solution {
public:
    int findMin(vector<int>& nums) {
        int l=0,h=nums.size()-1,m;
        while(l<h){
            m=l+(h-l)/2;
            if(nums[m]>nums[m+1]) return nums[(m+1)%nums.size()];
            else if(nums[l]>nums[m]) h=m-1;
            else l=m+1;
        }
        return nums[(l+1)%nums.size()];
    }
};