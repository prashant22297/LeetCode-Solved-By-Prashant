class Solution {
    public String reverseWords(String s) {
        String ans = "";
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split(" ");
        for(int i =0;i<ss.length;i++){
            sb.append(ss[i]);
            sb.reverse();
            if(i==ss.length-1){
                 ans+=sb;
                break;
            }
             ans+=sb+" ";
            sb.setLength(0);
        }
        return ans;
    }
}