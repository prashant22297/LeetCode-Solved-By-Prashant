class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int i=0,max_freq=0;
        for(int j=0;j<answerKey.length();j++)
        {
            char ch = answerKey.charAt(j);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            max_freq = Math.max(max_freq,freq.get(ch));
            if(j-i+1>k+max_freq){
                freq.put(answerKey.charAt(i),freq.getOrDefault(answerKey.charAt(i),0)-1);
                i++;
            }
        }
        return answerKey.length()-i;
    }
}