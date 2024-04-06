class Solution {
    public String minRemoveToMakeValid(String s) {
        int left = 0;
        int right = 0;
        int count=0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                if(count>0){
                    count--;
                }
                else{
                    sb.setCharAt(i,'*');
                }
            }
        }
        count=0;
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)==')'){
                count++;
            }
            else if(s.charAt(i)=='('){
                if(count>0){
                    count--;
                }
                else{
                    sb.setCharAt(i,'*');
                }
            }
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}