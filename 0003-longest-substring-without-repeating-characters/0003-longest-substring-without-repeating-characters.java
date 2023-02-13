class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> temp = new ArrayList<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            while(temp.contains(s.charAt(i)))temp.remove(0);
    
            temp.add(s.charAt(i));
            ans=Math.max(ans,temp.size());
        }
        return ans;
    }
}