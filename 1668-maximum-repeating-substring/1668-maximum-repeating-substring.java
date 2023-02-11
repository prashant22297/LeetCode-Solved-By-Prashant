class Solution {
    public int maxRepeating(String seq, String word) {
        int count=0;
        String s = word;
        while(seq.contains(s)){
            count++;
            s+=word;
        }
        return count;
    }
}