class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        int mul=0;
        String temp_string="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z') ans.append(ch);
            else if(ch>='0' && ch<='9') mul=mul*10 + ch - '0';
            else if(ch == '['){
                // System.out.println(mul);
                temp_string = decodeString(s.substring(i+1));
                // System.out.println(mul);
                for(int j=0;j<mul;j++) ans.append(temp_string);
                mul=0;
                int bracket=1;
                while(bracket!=0){
                    i++;
                    if(s.charAt(i)=='[')bracket++;
                    else if(s.charAt(i)==']')bracket--;
                }
                mul=0;
            }
            else if(ch==']') break;
        }
        return ans.toString();
    }
}