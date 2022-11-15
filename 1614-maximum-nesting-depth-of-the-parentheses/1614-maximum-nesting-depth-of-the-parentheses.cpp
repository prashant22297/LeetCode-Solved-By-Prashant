class Solution {
public:
    int maxDepth(string s) {
        stack<char> st;
        int open=0,ans=0;
        for(int i=0;i<s.size();i++){
            if(st.empty() && s[i]=='('){
                open++;
                st.push(s[i]);
            }
            else if(!st.empty()){
                if(s[i]==')'){
                    st.pop();
                    ans=max(open,ans);
                    open--;
                }
                else if(s[i]=='('){
                    st.push(s[i]);
                    open++;
                }
            }
        }
        return st.empty()?ans:0;
    }
};