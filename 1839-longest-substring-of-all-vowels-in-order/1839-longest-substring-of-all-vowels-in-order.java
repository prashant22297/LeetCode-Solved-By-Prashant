class Solution {
    public int longestBeautifulSubstring(String word) {
        int count=0;
        for(int i=1;i<word.length();i++){
            int j=i-1;
            while(i<word.length() && word.charAt(i-1)<=word.charAt(i)){
                i++;
            }
            String temp = word.substring(j,i);
            // System.out.println(temp);
            Set<Character> s = new HashSet<>();
            for(char ch : temp.toCharArray())
                s.add(ch);
            if(s.size()==5){
                count=Math.max(count,temp.length());
            }
        }
        return count;
    }
}