class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int empty= numBottles/numExchange;
            ans+=empty;
            numBottles-=(empty*numExchange);
            numBottles+=empty;
        }
        return ans;
    }
}