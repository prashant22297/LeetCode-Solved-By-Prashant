class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int ans=0;
        boolean odd=false;
        for(int i : freq.values()){
            if(i%2==0) ans+=i;
            else {
                odd=true;
                ans+=i-1;
            }
        }
        return odd==true?ans+1:ans;
    }
}