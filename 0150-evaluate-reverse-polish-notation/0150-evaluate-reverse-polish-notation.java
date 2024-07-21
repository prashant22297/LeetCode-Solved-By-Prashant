class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") ||s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int temp=0;
                if(s.equals("+")){
                    temp=a+b;
                }
                else if(s.equals("-")){
                    temp=a-b;
                }
                else if(s.equals("*")){
                    temp=a*b;
                }
                else if(s.equals("/")){
                    temp=a/b;
                }
                st.push(temp);
            }
            else st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}