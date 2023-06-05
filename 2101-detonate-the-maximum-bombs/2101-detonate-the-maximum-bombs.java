class Solution {
    public int maximumDetonation(int[][] bombs) {
        int ans=0;
        for(int i = 0;i<bombs.length;i++){
            ans = Math.max(ans,dfs(bombs,new boolean[bombs.length],i));
        }
        return ans;
    }
    private int dfs(int[][] bombs, boolean[] visited, int curr){
        visited[curr]= true;
        int count=1;
        for(int i=0;i<bombs.length;i++){
            if(visited[i]==false && isRange(bombs[curr],bombs[i])){
                visited[i]=true;
                count+=dfs(bombs, visited,i);
            }
        }
        return count;
    }
    private boolean isRange(int[] a, int[] b){
        long dx = a[0]-b[0] , dy = a[1]-b[1], r = a[2];
        return dx * dx + dy*dy <=r*r;
    }
}