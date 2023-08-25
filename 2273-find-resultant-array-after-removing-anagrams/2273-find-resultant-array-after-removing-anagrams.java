class Solution {
    public List<String> removeAnagrams(String[] words) {
        int len = words.length;
        int i = len-1;
        while(i<len && i>0){
            char[] aa = (words[i].toCharArray());
            char[] bb = (words[i-1].toCharArray());
            Arrays.sort(aa);
            Arrays.sort(bb);
            String a = new String(aa);
            String b = new String(bb);
            if(a!="" && a.equals(b)){
                words[i] = "";
                
            }
            i--;
            
        }
        List<String> ans = new ArrayList<>();
        for(String s : words){
            if(s!="")
                ans.add(s);
        }
        return ans;
    }
}