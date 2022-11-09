class Solution {
public:
    bool isPossible(vector<int>& v, int m ,int k, int mid){
        if(m==0) return true;
        int count=0;
        for(int i=0;i<v.size();i++){
            if(v[i]-mid<=0){
                count++;
                  if(count==k){
                    m--;
                    count=0;
                }
            }
            else count=0;
            if(m<=0) return true;
        }
        return false;
    }
    int minDays(vector<int>& bloomDay, int m, int k) {
        int n = bloomDay.size();
        int max_ele = INT_MIN;
        for(int i: bloomDay){
            if(i>max_ele) max_ele=i;
        }
        int start=0, end= max_ele,mid,ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
};