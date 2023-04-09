class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0,time=0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1) fresh++;
            }
        }
        int[] ax = {-1,1,0,0};
        int[] ay = {0,0,-1,1};
        if(fresh==0) return 0;
        if(q.size()==0) return -1;
        while(!q.isEmpty()){
            time++;
            int si=q.size();
            for(int z=0;z<si;z++ ){
                int[] t=q.poll(); 
                int i=t[0];
                int j=t[1];
                
                for(int k=0;k<4;k++){
                    int nx=ax[k]+i;
                    int ny=ay[k]+j;
                    if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]==1){
                        fresh--;
                        grid[nx][ny]=2;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }
        if(fresh==0) return time-1;
        else return -1;
    }
}