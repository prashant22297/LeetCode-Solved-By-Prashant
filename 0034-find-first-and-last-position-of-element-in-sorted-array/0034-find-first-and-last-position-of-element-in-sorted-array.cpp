class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int l=0,h=nums.size()-1,m;
        vector<int> ans;
        int one=-1,two=-1;
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]==target)
            {
                two=m;
                l=m+1;
            }
            else if(nums[m]>target) h=m-1;
            else l=m+1;
        }
        l=0,h=nums.size()-1;
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]==target)
            {
                one=m;
                h=m-1;
            }
            else if(nums[m]>target) h=m-1;
            else l=m+1;
        }
        ans.push_back(one);
        ans.push_back(two);
        return ans;
    }
};