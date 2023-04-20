class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int post=0,ans=0;
        for(int i=satisfaction.length-1;i>=0; i--){
            post +=satisfaction[i];
            if(post>=0) ans+=post;
        }
        return ans;
    }
}