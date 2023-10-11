class Solution {
    public void setZeroes(int[][] matrix) {
        // Method 1 : Taking another matrix to mark 0.
        // int m = matrix.length;
        // int n = matrix[0].length;
        // boolean[][] setZero = new boolean[m][n];
        // for(int i = 0 ; i<m;i++){
        //     for(int j = 0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             setZero[i][j]=true;
        //         }
        //     }
        // }
        // for(int i = 0 ; i<m;i++){
        //     for(int j = 0;j<n;j++){
        //         if(setZero[i][j]){
        //             for(int k = 0;k<n;k++){
        //                 matrix[i][k]=0;
        //             }
        //             for(int k = 0;k<m;k++){
        //                 matrix[k][j]=0;
        //             }
        //         }
        //     }
        // }
        
        // Method : 2: We will use two variable isRowZero and isColumnZero and the 0th row and 0th column for marking the 0.
        
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRowZero = false, isColumnZero = false;
        for(int i = 0; i<m;i++){
            if(matrix[i][0]==0)
                isColumnZero = true;
        }
        for(int j = 0;j<n;j++){
            if(matrix[0][j]==0)
                isRowZero = true;
        }
        
        for(int i = 1;i<m;i++){
            for(int j =1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i = 1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j =1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int j =1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i = 1;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }
       
        if(isColumnZero){
            for(int i = 0; i<m;i++)
                matrix[i][0]=0;
        }
        if(isRowZero){
            for(int j = 0;j<n;j++)
                matrix[0][j]=0;
        }
    }
}