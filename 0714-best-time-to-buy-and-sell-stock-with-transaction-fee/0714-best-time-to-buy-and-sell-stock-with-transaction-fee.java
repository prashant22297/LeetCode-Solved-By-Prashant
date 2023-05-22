class Solution {
    public int maxProfit(int[] prices, int fee) {
        int lp = prices[0], ls=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-lp-fee>ls) ls = prices[i]-lp-fee; 
            if(prices[i]-ls<lp) lp = prices[i]-ls;
        }
        return ls;
    }
}