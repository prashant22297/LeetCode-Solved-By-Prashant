class Solution {
    long mod=1000000000+7;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2, odd=n/2; 
        long ans=(Power(5,even)*Power(4,odd))%mod;
        return (int)ans;
    }
    public long Power(long n, long pow){
        if(pow==0) return 1;
        if(pow%2==0) return Power((n*n)%mod,pow/2);
        else return (Power((n*n)%mod,pow/2)*n)%mod;
    }
}