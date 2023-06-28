class Solution {
    public String longestPalindrome(String s) {
        String ans ="";
        int len = s.length();
        for(int i=0;i<s.length();i++){
            int l = i, r=i;
            while(l>=0 && r<len){
                if(s.charAt(l)==s.charAt(r)){
                     if(ans.length()<=r-l+1){
                        ans=s.substring(l,r+1);
                    }
                }
                else break;
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<len){
                if(s.charAt(l)==s.charAt(r)){
                     if(ans.length()<=r-l+1){
                        ans=s.substring(l,r+1);
                    }
                }
                else break;
                l--;
                r++;
            }
        }
        return ans;
    }
}