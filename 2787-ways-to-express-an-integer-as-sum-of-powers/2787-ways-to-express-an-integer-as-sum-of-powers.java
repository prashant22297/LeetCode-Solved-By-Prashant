class Solution {
    int mod = 1000000000 + 7;
    Integer[][] memo;
    public int numberOfWays(int n, int x) {
        memo=new Integer[n+1][n+1];
        return numberOfWaysHelper(n,x,1)%mod;
    }
    public int numberOfWaysHelper(int n, int x,int si){
        if(n<=0 || si>n){
           if(n==0){
              return 1;
           }
           return 0;
        }
        if(memo[n][si]!=null){
            return memo[n][si];
        }
        int pick=numberOfWaysHelper(n-(int)Math.pow(si,x),x,si+1);
        int notpick=numberOfWaysHelper(n,x,si+1);  
        return memo[n][si] = (pick%mod+notpick%mod)%mod;
    }
}