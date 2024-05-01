class Solution {
    int N;
    int[] ans, count;
    List<List<Integer>> adj;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        N = n;
        ans = new int[n];
        count = new int[n];
        Arrays.fill(count, 1);
        adj = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs1(0, -1);
        dfs2(0, -1);
        return ans;
    }

    public void dfs1(int node, int par) {
        for (int child : adj.get(node)) {
            if (child != par) {
                dfs1(child, node);
                count[node] = count[node] + count[child];
                ans[node] = ans[node] + count[child] + ans[child];
            }
        }
    }

    public void dfs2(int node, int par) {
        for (int child : adj.get(node)) {
            if (child != par) {
                ans[child] = ans[node] - count[child] + (N - count[child]);
                dfs2(child, node);
            }
        }
    }
}
