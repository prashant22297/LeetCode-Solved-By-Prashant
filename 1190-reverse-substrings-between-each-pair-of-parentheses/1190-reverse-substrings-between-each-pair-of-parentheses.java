class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        s="("+s+")";
        for(char ch : s.toCharArray()){
            if(ch==')'){
                sb = new StringBuilder();
                while(true){
                    char temp = st.pop();
                    if(temp=='('){
                        for(int i=0;i<sb.length();i++){
                            st.push(sb.charAt(i));
                        } 
                        break;
                    }
                    else{
                        sb.append(temp);
                    }
                }
            }
            else{
                st.push(ch);
            }
        }
        return sb.reverse().toString();
    }
}