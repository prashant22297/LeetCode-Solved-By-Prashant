class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,grid.length,grid[0].length);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid,int i , int j, int n, int m ){
        if(i<0 || i>=n ||j<0 || j>=m || grid[i][j]!='1') return;
        grid[i][j]='2';
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
    }
}