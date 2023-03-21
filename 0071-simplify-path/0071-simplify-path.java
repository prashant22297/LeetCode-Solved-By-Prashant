class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s: dir){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")){
                if(st.isEmpty()) continue;
                else st.pop();
            } 
            else st.add(s);
        }
        return "/"+String.join("/",st);
    }
}