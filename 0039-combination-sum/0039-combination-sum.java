class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pro = new ArrayList<>();
        int n = candidates.length;
        solve(0,n,candidates, pro, target, 0,ans);
        return ans;
    }
    private void solve(int idx, int n , int[] unpro, List<Integer> pro, int target, int sum,List<List<Integer>> ans){
        if(idx>=n){
            if(sum==target){
                ans.add(new ArrayList<>(pro));
                // System.out.println(pro);
                return;
            }
            return;
        }
        sum+=unpro[idx];
        pro.add(unpro[idx]);
        if(sum<=target){
            solve(idx,n,unpro,pro,target,sum,ans);
        }
        sum-=unpro[idx];
        pro.remove(pro.size()-1);
        solve(idx+1,n,unpro,pro,target,sum,ans);
    }
}