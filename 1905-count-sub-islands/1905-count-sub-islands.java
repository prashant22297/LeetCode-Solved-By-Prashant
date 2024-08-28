class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1 && solve(grid1, grid2, i, j, m, n)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean solve(int[][] grid1, int[][] grid2, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid2[i][j] == 0 || grid2[i][j] == -1) {
            return true;
        }
        grid2[i][j] = -1;
        boolean res = true;
        if (grid1[i][j] != 1) {
            res = false;
        }
        res = res & solve(grid1, grid2, i + 1, j, m, n);
        res = res & solve(grid1, grid2, i, j + 1, m, n);
        res = res & solve(grid1, grid2, i - 1, j, m, n);
        res = res & solve(grid1, grid2, i, j - 1, m, n);
        return res;
    }
}