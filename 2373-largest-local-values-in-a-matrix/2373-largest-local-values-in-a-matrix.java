class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m - 2][n - 2];
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int y = i; y < i + 3; y++) {
                    for (int x = j; x < j + 3; x++) {
                        ans[i][j] = Math.max(ans[i][j], grid[y][x]);
                    }
                }
            }
        }
        return ans;
    }
}