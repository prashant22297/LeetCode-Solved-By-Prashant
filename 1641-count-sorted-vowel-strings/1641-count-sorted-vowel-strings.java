class Solution {
    public int countVowelStrings(int n) {
        return solve(0,n);
    }
    public int solve(int idx, int n){
        if(n==0) return 1;
        int ans=0;
        for(int i=idx;i<5;i++)
            ans+=solve(i,n-1);
        return ans;
    }
}