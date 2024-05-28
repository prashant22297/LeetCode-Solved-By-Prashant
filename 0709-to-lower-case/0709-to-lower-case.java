class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch))
                ans+=Character.toLowerCase(ch);
            else ans+=ch;
        }
        return ans;
    }
}