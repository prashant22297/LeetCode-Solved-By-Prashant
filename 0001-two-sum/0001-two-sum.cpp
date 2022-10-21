class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // Method 1 O(N^2)
        // int n=nums.size();
        // vector<int> ans;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans.push_back(i);
        //             ans.push_back(j);
        //             break;
        //         }
        //     }
        // }
        // return ans;
        
        // Method 2 Improved Complexity O(N)
        int n=nums.size();
        vector<int> ans;
        unordered_map<int,int> mp;
        for(int i=0;i<n;i++){
            if(mp.find(target-nums[i])!=mp.end()){
                ans.push_back(i);
                ans.push_back(mp.find(target-nums[i])->second);
            }
            mp.insert({nums[i],i});
        }
        return ans;
    }
};