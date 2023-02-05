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
        return solve(1,n,0);
    }
}