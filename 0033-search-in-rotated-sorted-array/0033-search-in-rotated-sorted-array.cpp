class Solution {
public:
    int search(vector<int>& nums, int target) {
        int pivot=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]>nums[i]){
                pivot=i;
                break;
            }
        }
        int l,h,m;
        if(pivot>0 && target>=nums[0] && target<=nums[pivot-1]){
            l=0;
            h=pivot-1;
        }
        else {
            l=pivot;
            h=nums.size()-1;
        }
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) h=m-1;
            else l=m+1;
        }
        return -1;
    }
};