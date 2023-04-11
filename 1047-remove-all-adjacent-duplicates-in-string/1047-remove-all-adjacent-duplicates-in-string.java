class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.isEmpty()) st.push(ch);
            else if(ch==st.peek()){
                st.pop();
            }
            else st.push(ch);
        }
        String ans="";
        for(char ch : st){
            ans+=ch;
        }
        return ans;
    }
}