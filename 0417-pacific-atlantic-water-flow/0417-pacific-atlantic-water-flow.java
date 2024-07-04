class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int nRow = heights.length;
        int nCol = heights[0].length;
        
        boolean[][] pacific = new boolean[nRow][nCol];
        boolean[][] atlantic = new boolean[nRow][nCol];
        
        for(int i=0;i<nRow;i++){
            dfs(i,0,nRow,nCol,heights,pacific,0);
        }
        for(int j=0;j<nCol;j++){
            dfs(0,j,nRow,nCol,heights,pacific,0);
        }
        for(int i=0;i<nRow;i++){
            dfs(i,nCol-1,nRow,nCol,heights,atlantic,0);
        }
        for(int j=0;j<nCol;j++){
            dfs(nRow-1,j,nRow,nCol,heights,atlantic,0);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nRow;i++){
            for(int j=0;j<nCol;j++){
                if(pacific[i][j]==true && atlantic[i][j]==true){
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    ans.add(cell);
                }
            }
        }
        return ans;
    }
    
    private void dfs(int row, int col, int nRow, int nCol, int[][] heights, boolean[][] pacific, int prevHeight){
        if(row<0 || col<0 || row>=nRow || col>=nCol || pacific[row][col]==true || heights[row][col]<prevHeight){
            return;
        }
        pacific[row][col]=true;
        dfs(row+1,col,nRow,nCol,heights,pacific,heights[row][col]);
        dfs(row-1,col,nRow,nCol,heights,pacific,heights[row][col]);
        dfs(row,col+1,nRow,nCol,heights,pacific,heights[row][col]);
        dfs(row,col-1,nRow,nCol,heights,pacific,heights[row][col]);
    }
}