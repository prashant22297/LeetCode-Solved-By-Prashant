class Solution {
    public int countArrangement(int n) {
        return solve(n,new boolean[n+1],1);
    }
    public int solve(int n, boolean[] vis,int pos){
        if(pos>n){
            return 1;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if((vis[i]==false) && (pos % i == 0 || i%pos == 0)){
                vis[i]=true;
                count+=solve(n,vis,pos+1);
                vis[i]=false;
            }
        }
        return count;
    }
}