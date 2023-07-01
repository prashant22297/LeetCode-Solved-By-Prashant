class Solution {
    int ans;
    public int distributeCookies(int[] cookies, int k) {
        int[] child = new int[k];
        Arrays.fill(child,0);
        ans = Integer.MAX_VALUE;
        solve(0,cookies, child, k);
        return ans;
    }
    
    private void solve(int idx, int[] cookies, int[] child, int k){
        if(idx==cookies.length){
            int mx =0;
            for(int i : child){
                mx = Math.max(mx,i);
            }
            ans=Math.min(mx,ans);
            return;
        }
        for(int i=0;i<k;i++){
            child[i]+=cookies[idx];
            solve(idx+1, cookies,child,k);
            child[i]-=cookies[idx];
        }
    }
}