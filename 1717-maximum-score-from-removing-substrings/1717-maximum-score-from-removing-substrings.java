class Solution {
    int ans;
    StringBuilder sb;
    public int maximumGain(String s, int x, int y) {
        sb = new StringBuilder();
        ans =0;
        String searchPattern;
        int score;
        if(x>y){
            solve(s,"ab",x);
            solve(sb.toString(),"ba",y);
        }
        else{
            solve(s,"ba",y);
            solve(sb.toString(),"ab",x);
        }
        return ans;
    }
    public void solve(String s,String searchPattern, int score){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty()){
                char ch = st.peek();
                String match = ""+ch+c;
                if(match.equals(searchPattern)){
                    ans+=score;
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else st.push(c);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
    }
}