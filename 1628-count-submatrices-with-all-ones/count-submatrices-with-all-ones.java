class Solution {
    public int numSubmat(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r][c];
        //first add all elemnt in side wards 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    //only leave j=0 
                    if (j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i][j - 1] + 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        //then add all elemnt in up ward
        //same time add vaue while adding the value in array to result 
        int result = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dp[i][j] > 0) {
                    int minWidth = dp[i][j];
                    for (int k = i; k >= 0; k--) {
                        minWidth = Math.min(minWidth, dp[k][j]);
                        result += minWidth;
                    }
                }
            }
        }
        return result;

    }
}