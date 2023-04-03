class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=k+1,white=0;
        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)=='W') white++;
            if(i>=k-1){
                if(i-k>=0 && blocks.charAt(i-k)=='W') white--;
                ans=Math.min(ans,white);
            }
        }
        return ans;
    }
}