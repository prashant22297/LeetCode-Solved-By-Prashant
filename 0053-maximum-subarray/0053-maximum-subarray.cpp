class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=INT_MIN,msf=0;
        for(int i: nums){
            if(msf<i && msf<0){
                msf=i;
            }
            else msf+=i;
            sum=max(sum,msf);
        }
        return sum;
    }
};