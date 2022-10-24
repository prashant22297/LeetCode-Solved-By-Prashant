class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        for(int i=1;i<nums.size()-1;i++){
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i]) return i;
        }
        if(nums.size()>1){
            if(nums[1]<nums[0]) return 0;
            else if(nums[nums.size()-2]<nums[nums.size()-1]) return nums.size()-1;
        }
        return 0;
    }
};