class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> positive,negative,ans;
        for(int i: nums){
            if(i>=0) positive.push_back(i);
            else negative.push_back(i);
        }
        // ans.push_back(positive[0]);
        for(int i=0;i<nums.size()/2;i++){
            ans.push_back(positive[i]);
            ans.push_back(negative[i]);
        }
        return ans;
    }
};