class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for(String ss : words){
            String[] temp = ss.split("["+separator+"]");
            for(String s : temp) if(s.length()>0)ans.add(s);
        }
        return ans;
    }
}