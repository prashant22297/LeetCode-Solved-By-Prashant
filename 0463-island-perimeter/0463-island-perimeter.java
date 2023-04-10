class Solution {
    int ans=0;
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(i,j,m,n,grid);
                    break;
                }
            }
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(grid[i][j]==2)
        //             ans--;
        //     }
        // }
        return ans;
    }
    public void dfs(int i, int j, int m ,int n, int[][] grid){
        if(i<0 || i>=m || j<0 || j>=n || !(grid[i][j]==1)){
            if(!(i<0 || i>=m || j<0 || j>=n) && grid[i][j]==2){
                return;
            }
            else{
            ans++;
            return;
            }
        }
        grid[i][j]=2;
//         int ans=4;
//         if((i < m-1) && grid[i+1][j]==1)ans--; // checks if top == 1 
//         if((j < n-1)  && grid[i][j+1]==1)ans--;//checks if right == 1 
        
//         if(j > 0 && grid[i][j-1]==1)ans--; // checks if left == 1 
//         if(i > 0 && grid[i-1][j]==1)ans--; // checks if bottom == 1  
        // dfs(i+1,j,m,n,grid);
        // dfs(i-1,j,m,n,grid);
        // dfs(i,j+1,m,n,grid);
        // dfs(i,j-1,m,n,grid);
        // return temp;
        int[] ax = {1,-1,0,0};
        int[] ay = {0,0,-1,1};
        for(int k=0;k<4;k++){
            int nx=ax[k]+i;
            int ny=ay[k]+j;
            dfs(nx,ny,m,n,grid);
        }
    }
}