class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        for(;i<a.length;i++){
            if(a[i]!=b[i]) return b[i];
        }
        return b[i];
    }
}