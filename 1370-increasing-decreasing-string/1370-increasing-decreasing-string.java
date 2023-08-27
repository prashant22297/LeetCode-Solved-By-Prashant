class Solution {
    public String sortString(String s) {
        String ans = "";
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        Boolean f = true;
        while(f){
            f=false;
        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                char ch = (char)('a'+i);
                ans=ans+ch;
                freq[i]--;
                f=true;
            }
        }
        for(int i = 25;i>=0;i--){
            if(freq[i]>0){
                char ch = (char)('a'+i);
                ans=ans+ch;
                freq[i]--;
                f=true;
            }
        }
        }
        return ans;
    }
}