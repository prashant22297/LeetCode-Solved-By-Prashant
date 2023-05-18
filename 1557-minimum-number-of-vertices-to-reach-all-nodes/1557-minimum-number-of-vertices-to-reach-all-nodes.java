class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int i=0;i<edges.size();i++)
            vis[edges.get(i).get(1)]=true;
        for(int i=0;i<n;i++) if(vis[i]==false) ans.add(i);
        return ans;
    }
}