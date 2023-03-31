class Solution {
    public int maximumWhiteTiles(int[][] tiles, int car) {
        Arrays.sort(tiles,(a,b)->a[0]-b[0]);
        int n=tiles.length,ans=0;
        int right =0,curr=0;
        for(int i=0;i<n;i++){
            int start = tiles[i][0];
            int end = start+car-1;
            while(right<n && tiles[right][1]<end){
                curr+=tiles[right][1]-tiles[right][0]+1;
                right++;
            }
            if(right == n || tiles[right][0]>end){
                ans=Math.max(ans,curr);
            }
            else
                ans = Math.max(ans,curr+end-tiles[right][0]+1);
            
            curr-=tiles[i][1]-tiles[i][0]+1;
        }
        return ans;
    }
}