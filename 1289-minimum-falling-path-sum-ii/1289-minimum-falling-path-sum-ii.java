class Solution {

    // Method 1: Using Recursion + Memo (n^3)

    //     public int minFallingPathSum(int[][] grid) {
    //         int m = grid.length;
    //         int n = grid[0].length;
    //         int ans = Integer.MAX_VALUE;
    //         int[][] dp = new int[n][m];
    //         for (int[] i : dp) {
    //             Arrays.fill(i, -1);
    //         }

    //         for (int j = 0; j < n; j++) {
    //             ans = Math.min(ans, solve(0, j, grid, m, n, dp));
    //         }
    //         return ans;
    //     }

    //     private int solve(int i, int j, int[][] grid, int m, int n, int[][] dp) {
    //         if (i >= m) return 0;
    //         if (dp[i][j] != -1) return dp[i][j];

    //         if (i == m - 1) return grid[i][j];

    //         int ans = Integer.MAX_VALUE;

    //         for (int jj = 0; jj < n; jj++) {
    //             if (jj != j) ans = Math.min(ans, grid[i][j] + solve(i + 1, jj, grid, m, n, dp));
    //         }
    //         return dp[i][j] = ans;
    //     }

    // Method 2: Bottom Up

    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = Integer.MAX_VALUE;
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int temp = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k != j) temp = Math.min(temp, grid[i + 1][k]);
                }
                grid[i][j] = grid[i][j] + temp;
            }
        }
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, grid[0][i]);
        }
        return ans;
    }
}
