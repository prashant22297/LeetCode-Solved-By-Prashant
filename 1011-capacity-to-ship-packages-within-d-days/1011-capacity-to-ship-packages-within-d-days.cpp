class Solution {
public:
    bool isPossible(vector<int>& weights, int days, int mid){
        int count=1,sum=0;
        for(int i: weights){
            if(sum+i>mid){
                count++;
                sum=0;
            }
            sum+=i;
            if(count>days) return false;
        }
        return true;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int start=0 , end=0,mid,ans=-1;
        for(int i: weights){
            if(i>start) start=i;
            end+=i;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(weights,days,mid)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
};