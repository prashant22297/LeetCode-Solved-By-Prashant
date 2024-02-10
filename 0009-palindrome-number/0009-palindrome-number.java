class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String ss ="";
        for(char c : s.toCharArray()){
            ss=c+ss;
        }
        
        System.out.println(s+" "+ss);
        return ss.equals(s)?true:false;
    }
}