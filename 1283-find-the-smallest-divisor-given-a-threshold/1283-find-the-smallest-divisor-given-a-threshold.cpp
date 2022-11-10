class Solution {
public:
    bool isPossible(vector<int>& nums,int threshold, int mid){
        int sum=0;
        for(int i: nums){
            sum=sum+(i+mid-1)/mid;
        }    
        if(sum<=threshold) return true;
        else return false;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start =1 , end=1000000,mid,ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(nums,threshold,mid)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
};