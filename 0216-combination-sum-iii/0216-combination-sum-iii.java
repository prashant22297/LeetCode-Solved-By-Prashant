class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(1,9,k,n,new ArrayList<>(),ans);
        return ans;
    }
    
    public void solve(int a, int b ,int k , int target, ArrayList<Integer> curr, List<List<Integer>> ans){
        if(target ==0 && curr.size()==k){
            ans.add(new ArrayList(curr));
        }
        
        for(int i=a;i<=b;i++){
            curr.add(i);
            solve(i+1,b,k,target-i,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}