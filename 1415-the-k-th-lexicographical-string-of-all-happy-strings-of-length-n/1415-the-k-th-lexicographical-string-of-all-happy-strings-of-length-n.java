class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        solve('-',n,ans,new StringBuilder());
        return ans.size()>=k?ans.get(k-1):"";
    }
    public void solve(char prev, int n,List<String> ans, StringBuilder curr){
        if(curr.length()==n){
            ans.add(curr.toString());
            return;
        }
        for(char ch : "abc".toCharArray()){
            if(ch!=prev){
                curr.append(ch);
                solve(ch,n,ans,curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
}