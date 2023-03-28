class Solution {
    public String truncateSentence(String s, int k) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++) {
            if(i==k-1)sb.append(ss[i]);
            else sb.append(ss[i]+" ");
        }
        return sb.toString();
    }
}