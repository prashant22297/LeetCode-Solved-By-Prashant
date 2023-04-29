class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int zero=0;
        int ti=-1,tj=-1,si=-1,sj=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) {
                    si=i;
                    sj=j;
                }
                if(grid[i][j]==2) {
                    ti=i;
                    tj=j;
                }
                if(grid[i][j]==0) zero++;
            }
        }
        return solve(grid,m,n,si,sj,ti,tj,zero);
    }
    public int solve(int[][] grid, int m, int n ,int si, int sj, int ti, int tj, int zero){
        // if(si==ti && sj== tj){
        //     return 1;
        // }
        
        if(si<0 || sj<0 || si>=m || sj >= n || grid[si][sj]==-1) return 0;
        if(grid[si][sj]==2) return zero==-1?1:0;
        grid[si][sj]=-1;
        zero--;
        int ans = solve(grid,m,n,si+1,sj,ti,tj,zero)+
            solve(grid,m,n,si-1,sj,ti,tj,zero)+
            solve(grid,m,n,si,sj+1,ti,tj,zero)+
            solve(grid,m,n,si,sj-1,ti,tj,zero);
        grid[si][sj]=0;
        zero++;
        return ans;
    }
}