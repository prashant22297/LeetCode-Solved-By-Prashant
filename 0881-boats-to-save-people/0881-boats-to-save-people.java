class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int ans=0;
        Arrays.sort(p);
        int l=0,r=p.length-1;
        while(l<=r){
            int sum = p[l]+p[r];
            if(sum<=limit){
                ans++;
                l++;
                r--;
            }
            else{
                ans++;
                r--;
            }
        }
        return ans;
    }
}