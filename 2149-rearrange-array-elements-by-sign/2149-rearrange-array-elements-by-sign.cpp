class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        // Two Pass O(n+n) and space O(N+N)
        // vector<int> positive,negative,ans;
        // for(int i: nums){
        //     if(i>=0) positive.push_back(i);
        //     else negative.push_back(i);
        // }
        // for(int i=0;i<nums.size()/2;i++){
        //     ans.push_back(positive[i]);
        //     ans.push_back(negative[i]);
        // }
        // return ans;
        
//         2nd method
        int n=nums.size();
        vector<int> ans(n,0);
        int indexpos = 0, indexneg=1;
        for(auto num: nums){
            if(num>0){
                ans[indexpos] = num;
                indexpos+=2;
            }
            if(num<0){
                ans[indexneg] = num;
                indexneg += 2;
            }
        }
        return ans;
    }
};