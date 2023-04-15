class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0,same=0,ans=0;
        int[] freq = new int[26];
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'A']++;
            same=Math.max(same,freq[s.charAt(j)-'A']);
            if(j-i+1-same>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}