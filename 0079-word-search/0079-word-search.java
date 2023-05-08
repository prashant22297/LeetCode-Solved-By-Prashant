class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(solve(board,word,m,n,i,j,0,vis)) return true;
            }
        }
        return false;
        
    }
    public boolean solve(char[][] grid, String word,int m,int n, int i ,int j , int idx, boolean[][] vis){
        if(grid[i][j]!=word.charAt(idx)) return false;
        
        if(idx==word.length()-1) return true;
        vis[i][j]=true;
        
        int[] ax = {0,0,1,-1};
        int[] ay = {1,-1,0,0};
        for(int k=0;k<4;k++){
            int nx = ax[k]+i;
            int ny = ay[k]+j;
            if(nx>=0 && nx<m && ny>=0 && ny<n && vis[nx][ny]!=true)
                if(solve(grid,word,m,n,nx,ny,idx+1,vis)) return true;
        }
        vis[i][j]=false;
        return false;
    }
}