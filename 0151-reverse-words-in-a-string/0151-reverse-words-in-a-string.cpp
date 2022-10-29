class Solution {
public:
    string reverseWords(string s) {
        string ans="",t="";
        int j=0;
        int temp=0,last=s.length()-1;
        while(s[temp]==' '){
            temp++;
        }
        while(s[last]==' '){
            last--;
        }
        int i=temp;
        for(;i<=last;i++){
            if(s[i]!=' ')
                t=t+s[i];
            else if(s[i]==' ') {
                if(t.length()>0 && t[t.size()-1]!=' ') t=" "+t;
                ans=t+ans;
                t="";
            }
            if(last==i)
                ans=t+ans;
        }
        return ans;
    }
};