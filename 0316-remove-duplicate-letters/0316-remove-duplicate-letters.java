class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastidx = new int[26];
        Stack<Character> st = new Stack<>(); 
        for(int i=0;i<s.length();i++)
            lastidx[s.charAt(i)-'a']=i;
        // System.out.println()
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(st.contains(ch)) continue;
            while(!st.isEmpty() && st.peek()>ch && lastidx[st.peek()-'a']>i){
                st.pop();
            }
            st.push(ch);
        }
        // System.out.println(st);
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}