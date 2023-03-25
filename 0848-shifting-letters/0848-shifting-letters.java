class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray();
        int postsum=0;
        for(int i=s.length()-1;i>=0;i--){
            postsum=(postsum+shifts[i])%26;
            ch[i]=(char)((ch[i]-'a'+postsum)%26+'a');
        }
        return String.valueOf(ch);
    }
}