class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for(char ch : letters){
            freq[ch-'a']++;
        }
        
        return solve(words,words.length,freq,score,0);
    }
    
    public int solve(String[] words, int n, int[] freq, int[] score, int idx){
        if(idx==n) return 0;
        int ex = solve(words,n,freq,score,idx+1);
        int inc=0;
        boolean flag = true;
        int temp_score=0;
        for(int i=0;i<words[idx].length();i++){
            char ch = words[idx].charAt(i);
            if(freq[ch-'a']==0) flag = false;
            freq[ch-'a']--;
            temp_score+=score[ch-'a'];
        }
        if(flag==true) inc = temp_score+solve(words,n,freq,score,idx+1);
        for(int i=0;i<words[idx].length();i++){
            char ch = words[idx].charAt(i);
            freq[ch-'a']++;
        }
        return Math.max(ex,inc);
    }
}