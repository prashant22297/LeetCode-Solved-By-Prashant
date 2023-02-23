class Solution {
    public char findKthBit(int n, int k) {
        return solve(n,k)==0?'0':'1';
    }
    public int solve(int n, int k){
        if(n==1 || k==1) return 0;
        int length = (int) Math.pow(2,n) - 1;
        int mid = length / 2;
        if(mid==k-1) return 1;
        if(k-1<mid) return solve(n-1, k);
        else return solve(n-1, length-k+1)^1;
    }
}