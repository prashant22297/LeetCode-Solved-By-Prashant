class Solution {
    public int closedIsland(int[][] grid) {
        // Approach:convert all the land touching the boundary by running dfs on boundaries only
        // now count all the land normally using dfs which all are a island
        int n = grid.length,m=grid[0].length,ans=0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i*j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==0){
                        dfs(i,j,n,m,grid);
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==0){
                    ans++;
                    dfs(i,j,n,m,grid);
                }
            }
        }
    return ans;
    }
    public void dfs(int i,int j , int n, int m ,int[][] grid){
        grid[i][j]=1;
        int ax[]={1,-1,0,0};
        int ay[]={0,0,1,-1};
        for(int k = 0;k<4;k++){
            int nx=i+ax[k];
            int ny=j+ay[k];
            if(yes(nx,ny,n,m,grid)) dfs(nx,ny,n,m,grid);
        }
    }
    public boolean yes(int i,int j , int n, int m ,int[][] grid){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==0) return true;
        else return false;
    }
}