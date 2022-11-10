class Solution {
public:
    bool isPossible(vector<int>& nums,int k , int mid){
        int count=1,sum=0;
        for(int i: nums){
            if(i+sum>mid){
                count++;
                sum=i;
            }
            else sum+=i;
            if(count>k) return false;
        }
        if(count<=k) return true;
        else return false;
    }
    int splitArray(vector<int>& nums, int k) {
        int start=nums[0],end=0,mid,ans=-1;
        for(int i: nums){
            if(start<i) start=i;
            end+=i;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
};