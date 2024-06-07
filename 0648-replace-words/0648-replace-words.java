class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                String s = word.substring(0,i+1);
                if(dict.contains(s)){
                    ans.append(s+" ");
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans.append(word+" ");
            }
        }
        return ans.toString().trim();
    }
}