import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        // Important to understand
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                pos.add(1 << i);
            }
        }

        int size = pos.size();
        long[] segmentTree = new long[4 * size];
        build(segmentTree, pos, 0, size - 1, 0);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = (int) query(segmentTree, 0, size - 1, 0, l, r);
        }
        return res;
    }

    private long query(long[] seg, int start, int end, int idx, int l, int r) {
        if (start > r || end < l) {
            return 1;
        }
        if (start >= l && end <= r) {
            return seg[idx];
        }
        int mid = (start + end) / 2;
        long left = query(seg, start, mid, idx * 2 + 1, l, r);
        long right = query(seg, mid + 1, end, idx * 2 + 2, l, r);
        return (left * right) % MOD;
    }

    private void build(long[] seg, List<Integer> arr, int start, int end, int idx) {
        if (start == end) {
            seg[idx] = arr.get(start) % MOD;
            return;
        }
        int mid = (start + end) / 2;
        build(seg, arr, start, mid, idx * 2 + 1);
        build(seg, arr, mid + 1, end, idx * 2 + 2);
        seg[idx] = (seg[idx * 2 + 1] * seg[idx * 2 + 2]) % MOD;
        return;
    }

}
