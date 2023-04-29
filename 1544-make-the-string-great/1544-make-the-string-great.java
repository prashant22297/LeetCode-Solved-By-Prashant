class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            // System.out.println(ch);
            if(st.isEmpty()) st.push(ch);
            else if((Character.isUpperCase(st.peek()) && Character.isLowerCase(ch)) && (Character.toLowerCase(st.peek())==ch)){
                st.pop();
            }
            else if((Character.isLowerCase(st.peek()) && Character.isUpperCase(ch)) && (Character.toUpperCase(st.peek())==ch)){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}