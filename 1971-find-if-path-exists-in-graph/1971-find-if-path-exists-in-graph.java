class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        // for(int i=0;i<n;i++){
        //     System.out.println(adj.get(i));
        // }
        
        Set<Integer> visited = new HashSet<>();
        return solve(source, destination, adj, visited);
    }
    
    private boolean solve(int s, int d, Map<Integer,ArrayList<Integer>> adj , Set<Integer> visited ){
        if(s==d) return true;
        
        visited.add(s);
        for(int i : adj.get(s)){
            if(!visited.contains(i)){
                if(solve(i,d,adj,visited)) return true;
            }
        }
        return false;
    }

}