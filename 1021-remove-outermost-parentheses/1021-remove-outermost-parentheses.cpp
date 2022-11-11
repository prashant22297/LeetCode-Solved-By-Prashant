class Solution {
public:
    string removeOuterParentheses(string s) {
        int open=0;
        string ans="";
        for(char ch : s){
            if(ch=='(' && open++>0){
                // open++;
                ans=ans+ch;
            }
            else if(ch==')' && open-->1){
                // open--;
                ans=ans+ch;
            }
        }
        return ans;
    }
};