class Solution {
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans= new ArrayList<>();
        solve(s,0,new ArrayList<>());
        return ans;
    }
    
    public void solve(String s, int idx, List<String> curr){
        if(idx>=s.length()){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPali(s.substring(idx,i+1))){
                curr.add(s.substring(idx,i+1));
                solve(s,i+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPali(String s){
        int l=0;
        int r = s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        if(l>=r) return true;
        else return false;
    }
}