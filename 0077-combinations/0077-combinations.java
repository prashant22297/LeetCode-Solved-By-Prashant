class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(n,k,ans,res,1);
        return res;
    }
    static void solve(int n , int k, List<Integer> ans , List<List<Integer>> res, int idx){
        if(ans.size()==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i = idx; i<=n;i++){
            ans.add(i);
            solve(n,k,ans,res,i+1);
            ans.remove(ans.size()-1);
        }
    }
}