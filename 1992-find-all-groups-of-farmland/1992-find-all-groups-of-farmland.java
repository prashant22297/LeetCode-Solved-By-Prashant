class Solution {

    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        List<int[]> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1 && !visited.contains(i + " " + j)) {
                    ans.add(solve(land, m, n, i, j, visited));
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public int[] solve(int[][] land, int m, int n, int i, int j, Set<String> visited) {
        Queue<int[]> q = new LinkedList();
        q.add(new int[] { i, j });
        visited.add(i + " " + j);
        int minX = i, minY = j;
        int maxX = i, maxY = j;
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int curX = temp[0];
            int curY = temp[1];
            int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
            for (int[] dir : directions) {
                int newX = curX + dir[0];
                int newY = curY + dir[1];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited.contains(newX + " " + newY) && land[newX][newY] == 1) {
                    minX = Math.min(minX, newX);
                    minY = Math.min(minY, newY);
                    maxX = Math.max(maxX, newX);
                    maxY = Math.max(maxY, newY);
                    q.add(new int[] { newX, newY });
                    visited.add(newX + " " + newY);
                }
            }
        }
        return new int[] { minX, minY, maxX, maxY };
    }
}
