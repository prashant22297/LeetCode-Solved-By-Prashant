class Solution {
    public int solve(int lc, int n, int lastcopied){
        if(lc == n) return 0;
        if(n%lc ==0){
            lastcopied=lc;
            lc+=lc;
            return 2+solve(lc, n, lastcopied);
        }
        else{
            lc+=lastcopied;
            return 1+solve(lc,n, lastcopied);
        }
    }
    public int minSteps(int n) {
        if(n==1) return 0;
        int ans=0;
        for(int i=2;i*i<=n;){
            if(n%i==0){
                ans+=i;
                n/=i;
            }else{
                i++;
            }
        }
        if(n!=1){
            ans+=n;
        }
        return ans;
        // return solve(1,n,0);
    }
}