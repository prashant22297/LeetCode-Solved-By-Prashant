class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans="";
        int i=0;
        while(strs[0].size()>i){
            // if(strs[0].size()==0)
                // return ans;
            char ch = strs[0][i];
            for(string &s : strs){
                if(s[i]!=ch)
                    return ans;
            }
            ans+=ch;
            i++;
        }
        return ans;
    }
};