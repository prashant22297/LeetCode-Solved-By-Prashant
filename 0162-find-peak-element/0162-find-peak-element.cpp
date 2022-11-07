class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        // O(N)
        // for(int i=1;i<nums.size()-1;i++){
        //     if(nums[i-1]<nums[i] && nums[i+1]<nums[i]) return i;
        // }
        // if(nums.size()>1){
        //     if(nums[1]<nums[0]) return 0;
        //     else if(nums[nums.size()-2]<nums[nums.size()-1]) return nums.size()-1;
        // }
        // return 0;
        // O(log N)
        int n=nums.size(),l=0,h=n-1,m;
        if(n==0 || n==1) return 0;
        while(l<=h){
            m=l+(h-l)/2;
            if(m>0 && m<(n-1)){
                if(nums[m-1]<nums[m] && nums[m+1]<nums[m]) return m;
                else if(nums[m-1]>nums[m]) h=m-1;
                else l=m+1;
            }
            else if(m==0){
                if(nums[m+1]<nums[m]) return m;
                else return m+1;
            } 
            else if(m==n-1){
                if(nums[m-1]<nums[m]) return m;
                else return m-1;
            }
        }
        return 0;
    }
};