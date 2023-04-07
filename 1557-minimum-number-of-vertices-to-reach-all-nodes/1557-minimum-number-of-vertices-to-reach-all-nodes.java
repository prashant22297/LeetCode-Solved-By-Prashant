class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        int[] vis = new int[n];
        for(int i=0;i<edges.size();i++){
            vis[edges.get(i).get(1)]=1;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0) ans.add(i);
        }
        return ans;
    }
}