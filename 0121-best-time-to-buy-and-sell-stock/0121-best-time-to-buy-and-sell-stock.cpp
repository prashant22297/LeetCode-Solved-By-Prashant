class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ans=0,temp=prices[0];
        for(int i=1;i<prices.size();i++){
            if(prices[i-1]>prices[i]){
                temp=min(temp,prices[i]);
            }
            ans=max(ans,prices[i]-temp);
        }
        return ans;
    }
};