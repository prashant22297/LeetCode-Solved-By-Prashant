class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0,e=(int)Math.sqrt(c);
        long mid;
        while(s<=e){
            mid=s*s+e*e;
            if(mid==c) return true;
            else if(mid<c) s++;
            else e--;
        }
        return false;
    }
}