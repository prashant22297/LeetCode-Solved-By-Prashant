class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mp = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        String temp="";
        if(digits.length()>0)
        solve(digits,0,ans,mp,temp);
        return ans;
    }
    
    public void solve(String digits, int idx, List<String> ans, String[] mp, String curr){
        if(idx>=digits.length()){
            ans.add(new String(curr));
            return;
        }
        String temp = mp[(digits.charAt(idx))-50];
        for(int i=0;i<temp.length();i++){
            curr=curr+temp.charAt(i);
            solve(digits,idx+1,ans,mp,curr);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}