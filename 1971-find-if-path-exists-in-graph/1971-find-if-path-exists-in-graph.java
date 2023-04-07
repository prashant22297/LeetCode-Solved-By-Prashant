class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int u = q.poll();
            visited[u]=true;
            if(u==destination) return true;
            for(int v : adj.get(u)){
                if(visited[v]==false){
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
        return visited[destination];
        
    }
}