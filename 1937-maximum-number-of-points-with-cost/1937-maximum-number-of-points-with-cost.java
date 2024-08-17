class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] prev = new long[n];
        for (int col = 0; col < n; col++) {
            prev[col] = points[0][col];
        }
        for (int row = 1; row < m; row++) {
            long[] left = new long[n];
            long[] right = new long[n];
            left[0] = prev[0];
            for (int col = 1; col < n; col++) {
                left[col] = Math.max(prev[col], left[col - 1] - 1);
            }
            right[n - 1] = prev[n - 1];
            for (int col = n - 2; col >= 0; col--) {
                right[col] = Math.max(prev[col], right[col + 1] - 1);
            }
            long[] curr = new long[n];
            for (int col = 0; col < n; col++) {
                curr[col] = points[row][col] + Math.max(left[col], right[col]);
            }
            prev = curr;
        }
        Arrays.sort(prev);
        return prev[n - 1];
    }
}