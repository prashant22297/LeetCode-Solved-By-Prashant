class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(sr,sc,image.length,image[0].length,image,color,image[sr][sc]);
        return image;
    }
    public void dfs(int i,int j,int m,int n,int[][] image, int color,int initial){
        if(i<0 || i>=m || j<0 || j>=n || image[i][j]==color) return;
        if(image[i][j]==initial){
            image[i][j]=color;
            dfs(i+1,j,m,n,image,color,initial);
            dfs(i-1,j,m,n,image,color,initial);
            dfs(i,j+1,m,n,image,color,initial);
            dfs(i,j-1,m,n,image,color,initial);
        }
    }
}