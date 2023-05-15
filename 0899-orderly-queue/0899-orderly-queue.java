class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
        else {
            String ss = new String(s);
            for(int i=0;i<s.length();i++){
                s=s.substring(1)+s.charAt(0);
                if(ss.compareTo(s)>0) ss=s;
            }
            return ss;
        }
        
    }
}