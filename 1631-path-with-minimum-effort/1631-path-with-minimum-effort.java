class Solution {
    private static final int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
    public int minimumEffortPath(int[][] heights) {
        
        int m = heights.length;
        int n = heights[0].length;
        int[][] result = new int[m][n];
        for(int i = 0; i<m;i++){
            Arrays.fill(result[i],Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        result[0][0]=0;
        pq.add(new int[] {0, 0, 0});
        while(!pq.isEmpty()) {
            int[] p = pq.poll();
            int i = p[0], j = p[1];
            if(i == m - 1 && j == n - 1) break;
            for(int[] d: dir) {
                int x = i + d[0], y = j + d[1];
                if(x < 0 || x >= m || y < 0 || y >= n) continue;
                int alt = Math.max(p[2], Math.abs(heights[i][j] - heights[x][y]));
                if(alt < result[x][y]) {
                    pq.add(new int[] {x, y, result[x][y] = alt});
                }
            }
        }
        return result[m - 1][n - 1];
    }
}