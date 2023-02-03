class Solution {
    public String longestWord(String[] words) {
        String ans="";
        ArrayList<String> w = new ArrayList<>();
        for(String s : words){
            w.add(s);
        }
        Collections.sort(w);
        // System.out.print(w);
        boolean present=false;
        for(String s : w){
            String pre="";
            present = true;
            for(char ch : s.toCharArray()){
                pre+=ch;
                if(!w.contains(pre)){
                    present = false;
                    break;
                }
                // System.out.println(pre+" "+ans);
                if(ans.length()<pre.length())
                {
                    ans=pre;
                }
                else if(ans.length()==pre.length()){
                    if(ans.compareTo(pre)>0){
                        ans=pre;
                    }
                }
            }    
        }
        return ans;
    }
}