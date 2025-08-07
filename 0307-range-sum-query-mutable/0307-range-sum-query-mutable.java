class NumArray {

    int[] segmentArray;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        segmentArray = new int[4 * n];
        int start = 0;
        int end = n - 1;
        buildSegmentTree(nums, 0, start, end);
    }

    public void buildSegmentTree(int[] arr, int idx, int start, int end) {
        if (start == end) {
            segmentArray[idx] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        buildSegmentTree(arr, 2 * idx + 1, start, mid);
        buildSegmentTree(arr, 2 * idx + 2, mid + 1, end);
        segmentArray[idx] = segmentArray[2 * idx + 1] + segmentArray[2 * idx + 2];
    }

    public int sumRange(int left, int right) {
        return rangeSumQuery(0, 0, n - 1, left, right);
    }

    public int rangeSumQuery(int idx, int start, int end, int l, int r) {
        if (start > r || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return segmentArray[idx];
        }
        int mid = (start + end) / 2;
        return rangeSumQuery(idx * 2 + 1, start, mid, l, r) + rangeSumQuery(2 * idx + 2, mid + 1, end, l, r);
    }

    public void update(int index, int val) {
        update(0, 0, n - 1, val, index);
    }

    public int update(int idx, int start, int end, int value, int i) {
        if (start == end) {
            segmentArray[idx] = value;
            return segmentArray[idx];
        }
        int mid = (start + end) / 2;
        if (i <= mid) {
            update(2 * idx + 1, start, mid, value, i);
        } else {
            update(2 * idx + 2, mid + 1, end, value, i);
        }
        return segmentArray[idx] = segmentArray[2 * idx + 1] + segmentArray[2 * idx + 2];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */