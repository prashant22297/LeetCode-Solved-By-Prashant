class Solution {
public:
    bool check(vector<int>& nums) {
        bool flag =false;
        int x=-1;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]<=nums[i+1]) continue;
            else if(nums[i]>nums[i+1] && flag == false){
                flag=true;
                x=i;
            }
            else return false;
        }
        if(x!=-1){
            if(nums[0]>=nums[nums.size()-1])
                return true;
            else return false;
        }
        return true;
    }
};