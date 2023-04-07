class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        dfs(rooms.get(0),rooms,visited,0);
        for(int v: visited){
            if(v==0) return false;
        }
        return true;
        
    }
    public void dfs(List<Integer> keys,List<List<Integer>> rooms,int[] visited,int curr){
        visited[curr] = 1;
        for(int k : keys){
            if(visited[k]==0) dfs(rooms.get(k),rooms,visited,k);
        }
    }
}