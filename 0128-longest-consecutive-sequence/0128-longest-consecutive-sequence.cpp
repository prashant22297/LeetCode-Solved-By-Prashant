class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ans=1,t=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]+1==nums[i]) t++;
            else if(nums[i]==nums[i-1]) continue;
            else t=1;
            ans=max(ans,t);
        }
        return nums.size()==0?0:ans;
    }
};