class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(s,0,ans, new ArrayList<>());
        return ans;
    }
    public boolean isPali(String s){
        String ss= s;
        int j=0;
        for(int i=ss.length()-1;i>=0;i--){
            if(ss.charAt(i)!=s.charAt(j++)) return false;
        }
        return true;
    }
    public void solve(String s, int idx, List<List<String>> ans,List<String> curr){
        if(idx >= s.length()){
            ans.add(new ArrayList(curr));
            return;
        }
        
        for(int i =idx; i< s.length();i++){
            if(isPali(s.substring(idx,i+1))){
                curr.add(s.substring(idx,i+1));
                solve(s,i+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}