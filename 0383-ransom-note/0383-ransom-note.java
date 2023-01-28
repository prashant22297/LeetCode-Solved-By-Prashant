class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] fre = new int[26];
        if(ransomNote.length()>magazine.length()) return false;
        for(char ch : magazine.toCharArray()) fre[ch-'a']++;
        for(char ch : ransomNote.toCharArray()){
            if(fre[ch-'a']>0){
                fre[ch-'a']--;
            }
            else return false;
        }
        return true;
    }
}