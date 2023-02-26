class Solution {
    public int[] divisibilityArray(String word, int m) {
        long sum=0;
        int[] ans = new int[word.length()];
        for(int i=0;i<word.length();i++){
            sum=(sum*10+(word.charAt(i)-'0'))%m;
            if(sum%m==0){
                ans[i]=1;
            }
            else ans[i]=0;
        }
        return ans;
    }
}