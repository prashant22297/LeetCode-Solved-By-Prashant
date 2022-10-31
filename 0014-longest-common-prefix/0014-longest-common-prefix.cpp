class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        // string ans="";
        // int i=0;
        // while(strs[0].size()>i){
        //     char ch = strs[0][i];
        //     for(string &s : strs){
        //         if(s[i]!=ch)
        //             return ans;
        //     }
        //     ans+=ch;
        //     i++;
        // }
        // return ans;
        
//         2nd method: O(NlogN)
        int n = strs.size();
        if(n==0) return "";
        sort(strs.begin(),strs.end());
        string s1=strs[0],s2=strs[n-1];
        int i=0;
        while(i<s1.size() && s1[i]==s2[i])
            i++;
        return s1.substr(0,i);
    }
};