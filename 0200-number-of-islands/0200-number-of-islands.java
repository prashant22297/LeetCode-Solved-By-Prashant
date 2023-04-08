class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') {
                    dfs(i,j,m,n,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int i, int j, int m, int n , char[][] grid){
        if(i>=m || i<0 || j>=n || j<0 || !(grid[i][j]=='1')) return;
        grid[i][j]='2';
        int[] ax = {1,-1,0,0};
        int[] ay = {0,0,-1,1};
        for(int k=0;k<4;k++){
            int nx=ax[k]+i;
            int ny=ay[k]+j;
            dfs(nx,ny,m,n,grid);
        }
    }
}