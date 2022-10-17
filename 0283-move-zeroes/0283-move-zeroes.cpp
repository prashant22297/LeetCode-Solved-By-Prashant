class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        int actual_pointer=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums[i],nums[actual_pointer]);
                actual_pointer++;
            }
        }
    }
};