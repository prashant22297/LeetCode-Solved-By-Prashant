class Solution {
public:
    void sortColors(vector<int>& nums) {
        int l=0,h=nums.size()-1,mid=0;
        while(mid<=h){
            if(nums[mid]==0) swap(nums[l++],nums[mid++]);
            else if(nums[mid]==1) mid++;
            else if(nums[mid]==2) swap(nums[mid],nums[h--]);
        }
    }
};