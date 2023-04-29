class Solution {
    public String makeGood(String s) {
        // Method 1:
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))==32){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;
        // Method 2:
        // Stack<Character> st = new Stack();
        // for(char ch : s.toCharArray()){
        //     // System.out.println(ch);
        //     if(st.isEmpty()) st.push(ch);
        //     else if((Character.isUpperCase(st.peek()) && Character.isLowerCase(ch)) && (Character.toLowerCase(st.peek())==ch)){
        //         st.pop();
        //     }
        //     else if((Character.isLowerCase(st.peek()) && Character.isUpperCase(ch)) && (Character.toUpperCase(st.peek())==ch)){
        //         st.pop();
        //     }
        //     else st.push(ch);
        // }
        // StringBuilder ans = new StringBuilder();
        // while(!st.isEmpty()){
        //     ans.append(st.pop());
        // }
        // return ans.reverse().toString();
    }
}