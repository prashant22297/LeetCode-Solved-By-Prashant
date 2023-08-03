class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String s1 = strs[0], s2 = strs[strs.length-1];
        int i=0;
        while(s1.length() != i && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }
}