class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=1;
            }
        }
        for(int i=0;i<mines.length;i++){
            grid[mines[i][0]][mines[i][1]]=0;
        }
        int[][] left = copy(grid);
        int[][] right = copy(grid);
        int[][] up = copy(grid);
        int[][] down = copy(grid);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=n-i-1;
                int y=n-j-1;
                if(j>0 && left[i][j]!=0) left[i][j]+=left[i][j-1];
                if(y<n-1 && right[x][y]!=0) right[x][y]+=right[x][y+1];
                if(i>0 && up[i][j]!=0) up[i][j]+=up[i-1][j];
                if(x<n-1 && down[x][y]!=0) down[x][y]+=down[x+1][y]; 
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,Math.min(left[i][j],Math.min(right[i][j],Math.min(up[i][j],down[i][j]))));
            }
        }
        
        return ans;
    }
    
    public static int[][] copy(int[][] src) {
        if (src == null) {
            return null;
        }
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = new int[src[i].length];
            System.arraycopy(src[i], 0, copy[i], 0, src[i].length);
        }
        return copy;
    }
}