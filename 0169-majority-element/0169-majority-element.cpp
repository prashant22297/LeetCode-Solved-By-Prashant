class Solution {
public:
    int majorityElement(vector<int>& nums) {
//         1st Method
        // unordered_map<int, int> freq;
        // for(int i=0;i<nums.size();i++)
        //     freq[nums[i]]++;
        // for(auto it=freq.begin();it!=freq.end();it++){
        //     if(it->second>nums.size()/2)
        //         return it->first;
        // }
        // return 0;
        
        // 2nd Method
        int ele,count=0;
        for(int i=0;i<nums.size();i++){
            if(count==0){
                count++;
                ele=nums[i];
            }
            else if(count!=0){
                if(ele==nums[i]) count++;
                else count--;
            }
        }
        return ele;
    }
};