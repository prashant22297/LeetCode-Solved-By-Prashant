class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch=='#' && s1.size()>=1)
                s1.pop();
            else if(ch!='#') s1.push(ch);
        }
        Stack<Character> s2 = new Stack<>();
        for(Character ch : t.toCharArray()){
            if(ch=='#' && s2.size()>=1)
                s2.pop();
            else if(ch!='#') s2.push(ch);
        }
        System.out.println(s1.toString()+" "+s2.toString());
        return (s1.toString().equals(s2.toString()));
    }
}