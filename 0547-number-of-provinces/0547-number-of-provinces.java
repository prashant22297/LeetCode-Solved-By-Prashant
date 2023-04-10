class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int ans=0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                dfs(i,visited,adj);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(int cur,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[cur]=true;
        for(int i : adj.get(cur)){
            if(visited[i]==false)
                dfs(i,visited,adj);
        }
    }
}