class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> unpro = new ArrayList<>();
        solve(0,nums, unpro);
        return ans;
    }
    public void solve(int ind, int[] pro, ArrayList<Integer> unpro){
        if(ind == pro.length){
            ans.add(new ArrayList<>(unpro));
            return;
        }
        unpro.add(pro[ind]);
        // System.out.print(unpro);
        solve(ind+1,pro,unpro);
        unpro.remove(unpro.size()-1);
        solve(ind+1,pro,unpro);
    }
}