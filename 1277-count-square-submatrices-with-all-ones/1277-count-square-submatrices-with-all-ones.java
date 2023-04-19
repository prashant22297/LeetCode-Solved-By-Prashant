class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(j-1>=0 && i-1>=0 && matrix[i][j]>=1){
                    matrix[i][j]=Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i][j-1]))+1;
                }
                ans+=matrix[i][j];
            }
        }
        return ans;
    }
}