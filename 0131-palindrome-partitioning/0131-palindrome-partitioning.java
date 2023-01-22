class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        solve(0,s,new ArrayList<>());
        return ans;
    }
    void solve(int idx, String s, List<String> unpro){
        if(idx==s.length()){
            ans.add(new ArrayList(unpro));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPali(s,idx,i)){
                unpro.add(s.substring(idx,i+1));
                solve(i+1,s,unpro);
                unpro.remove(unpro.size()-1);
            }
        }
    }
    boolean isPali(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}