class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1,r=num/2,mid;
        if(num==1) return true;
        while(l<=r){
            mid=l+(r-l)/2;
            if((mid*mid)==num) return true;
            else if((mid*mid)<num) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}