class Solution {
    public double myPow(double x, int n) {
        long nn =n;
        if(nn<0){
            nn=Math.abs(nn);
            x=1/x;
        }
        return Pow(x,nn);
    }
    public double Pow(double x, long n) {
        if(n==0) return 1;
        return n%2==0?Pow(x*x,n/2):Pow(x*x,n/2)*x;
    }
}