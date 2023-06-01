class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans=0;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        if(grid[n-1][m-1]==1 || grid[0][0]==1) return -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        grid[0][0]=1;
        while(!q.isEmpty()){
            int size = q.size();
            ans++;
            for(int i=0;i<size;i++){
                int[] pos = q.poll();
                if(pos[0]==n-1 && pos[1]==m-1){
                    return ans;
                }
                for(int[] dir:dirs){
                    int nx = pos[0]+dir[0];
                    int ny = pos[1]+dir[1];
                    if(nx<0 || nx>n-1 || ny<0 || ny>m-1 || grid[nx][ny]!=0) continue;
                    
                    q.offer(new int[]{nx,ny});
                    grid[nx][ny]=1;
                }
            }
        }
        return -1;
    }
    
    // private int solve(int[][] grid, int n ,int m , int i ,int j,int count){
    //     if(n==i && m==j) return count;
    //     grid[i][j]=-1;
    //     count++;
    //     int res = Integer.MAX_VALUE;
    //     int[] x={-1,-1,-1,0,1,1,1,0};
    //     int[] y={-1,0,1,1,1,0,-1,-1};
    //     for(int k=0;k<8;k++){
    //         int nx = i+x[k];
    //         int ny = j+y[k];
    //         if((nx<0 || nx>n || ny<0 || ny>m || grid[nx][ny]!=0))
    //             continue;
    //             res=Math.min(res,solve(grid,n,m,nx,ny,count));
    //     }
    //     count--;
    //     grid[i][j]=0;
    //     return res;
    // }
}