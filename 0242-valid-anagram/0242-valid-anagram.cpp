class Solution {
public:
    bool isAnagram(string s, string t) {
        int freq[26];
        for(int i=0;i<26;i++) freq[i]=0;
        for(char ch : s){
            freq[ch-'a']++;
        }
         for(char ch : t){
            freq[ch-'a']--;
        }
        for(int i=0;i<26;i++) 
            if(freq[i]!=0) return false;
        return true;
    }
};