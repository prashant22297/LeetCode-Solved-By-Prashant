class Solution {
    public int maxVowels(String s, int k) {
        int count=0,maxCount=0;
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o','u'));
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))) count++;
            if(i>=k) if(hs.contains(s.charAt(i-k))) count--;
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}