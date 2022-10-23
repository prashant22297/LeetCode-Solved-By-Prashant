class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        // Brute Force O(N^2)
        // int res=0;
        // for(int i=0;i<nums.size();i++){
        //     int sum=0;
        //     for(int j=i;j<nums.size();j++){
        //         sum+=nums[j];
        //         if(sum==k) res++;
        //     }
        // }
        // return res;
        
        // Optimised Approach
        int curr_sum=0,res=0;
        unordered_map<int,int> prev_sum;
        for(int i=0;i<nums.size();i++){
            curr_sum+=nums[i];
            if(curr_sum==k)
                res++;
            // if(curr_sum>k){
                if(prev_sum.find(curr_sum-k)!=prev_sum.end()){
                    res+=prev_sum[curr_sum-k];
                }
            // } 
            prev_sum[curr_sum]++;
        }
        return res;
    }
};