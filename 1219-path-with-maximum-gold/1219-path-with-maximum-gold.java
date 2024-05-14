class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0)
                    ans = Math.max(ans, dfs(m, n, grid, i, j));
            }
        }
        return ans;

    }

    public int dfs(int m, int n, int[][] grid, int x, int y) {
        if (x >= m || x < 0 || y >= n || y < 0 || grid[x][y] == 0) {
            return 0;
        }
        int temp = grid[x][y];
        grid[x][y] = 0;
        int tempans = 0;
        int[] row = { 0, 0, -1, 1 };
        int[] col = { -1, 1, 0, 0 };
        for (int i = 0; i < 4; i++) {
            int newX = x + row[i];
            int newY = y + col[i];
            tempans = Math.max(tempans, temp + dfs(m, n, grid, newX, newY));
        }
        grid[x][y] = temp;
        return tempans;
    }
}