class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(ans,path,graph,0);
        return ans;
    }
    
    public void dfs(List<List<Integer>> ans,List<Integer> path,int[][] graph, int curr){
        path.add(curr);
        if(curr==graph.length-1) ans.add(new ArrayList(path));
        else {
            for(int i : graph[curr]){
                dfs(ans,path,graph,i);
            }
        }
        path.remove(path.size()-1);
    }
}