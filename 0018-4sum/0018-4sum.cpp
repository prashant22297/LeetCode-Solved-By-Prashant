class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        // Fix 2 value and use two pointer for rest two value O(N^2log N)
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1,h=n-1;
                long long sum = target - (long)(nums[i]+nums[j]);
                while(l<h){
                    if(nums[l]+nums[h]==sum){
                        ans.push_back({nums[i],nums[j],nums[l],nums[h]});
                        while(l<h && nums[l]==nums[l+1])l++;
                        while(l<h && nums[h]==nums[h-1])h--;
                        l++;
                        h--;
                    }
                    else if(nums[l]+nums[h]>sum) h--;
                    else l++;
                }
                while(j+1<n && nums[j]==nums[j+1]) j++;
            }
            while(i+1<n && nums[i]==nums[i+1]) i++;
            
        }
        return ans;
    }
};