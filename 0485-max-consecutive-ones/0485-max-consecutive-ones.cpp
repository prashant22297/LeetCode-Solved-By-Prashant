class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n= nums.size(),count=0,max_count=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==1){
        //         count=1;
        //         while(i<n-1 && nums[i]==nums[i+1]){
        //             count++;
        //             i++;
        //         }
        //         max_count=max(count,max_count);
        //     }
        // }
        
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                count++;
            else count=0;
            max_count=max(count,max_count);
        }
        return max_count;
    }
};