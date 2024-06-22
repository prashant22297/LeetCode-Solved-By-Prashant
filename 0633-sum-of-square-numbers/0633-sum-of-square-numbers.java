class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0;i<=Math.sqrt(c);i++){
            int a = c-(i*i);
            int sq = (int)Math.sqrt(a);
            if(sq*sq==a){
                return true;
            }
        }
        return false;
    }
}