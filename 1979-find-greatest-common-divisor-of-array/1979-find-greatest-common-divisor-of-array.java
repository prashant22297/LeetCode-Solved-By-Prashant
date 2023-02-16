class Solution {
    public int findGCD(int[] nums) {
        int mx=0,mn=1111;
        for(int n:nums){
            mx = Math.max(mx,n);
            mn = Math.min(mn,n);
        }
        return gcd(mx,mn);
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}