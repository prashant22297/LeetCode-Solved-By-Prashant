class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}