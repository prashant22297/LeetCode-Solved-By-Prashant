class Solution {
    int mod = 1000_000_007;
    public int minNonZeroProduct(int p) {
        long ans=0;
        long n = (long)Math.pow(2,p)-1;
        ans = ((n%mod)*(myPow((n-1),n/2,mod)%mod))%mod;
        return (int)(ans%mod);
    }
    // long Pow(long x, long n) {
    //     if(n==0) return 1;
    //     return n%2==0?(Pow(((x%mod)*(x%mod))%mod,n/2))%mod:(Pow(((x%mod)*(x%mod))%mod,n/2)*x)%mod;
    // }
    private long myPow(long x, long y, long mod) {
        if (y == 0) return 1;
        long temp = myPow(x, y / 2, mod);
        long p = (temp * temp) % mod;

        return y % 2 == 1 ? (p * (x % mod)) % mod : p;
    }
}