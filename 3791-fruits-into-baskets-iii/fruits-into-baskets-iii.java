class Solution {
    class SegmentTree<T> {
        private final int size;
        private final List<T> tree;
        private final BinaryOperator<T> operation;

        SegmentTree(List<T> source, BinaryOperator<T> operation) {
            this.size = source.size();
            this.operation = operation;
            this.tree = new ArrayList<>(Collections.nCopies(size * 4, null));
            if (!source.isEmpty()) {
                build(source, 1, 0, size - 1);
            }
        }

        T get(int start, int end) {
            if (size == 0 || start < 0 || end >= size) {
                return null;
            }
            return queryRange(1, 0, size - 1, start, end);
        }

        void update(int index, T newValue) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(
                        "index (" + index + ") is out of segment tree bounds: [0.." + size + ")");
            }
            update(1, 0, size - 1, index, newValue);
        }

        private void build(List<T> source, int nodeIndex, int start, int end) {
            if (start == end) {
                tree.set(nodeIndex, source.get(start));
            } else {
                int mid = start + (end - start) / 2;
                int leftNodeIndex = nodeIndex * 2;
                int rightNodeIndex = nodeIndex * 2 + 1;

                build(source, leftNodeIndex, start, mid);
                build(source, rightNodeIndex, mid + 1, end);

                tree.set(nodeIndex, operation.apply(tree.get(leftNodeIndex), tree.get(rightNodeIndex)));
            }
        }

        private void update(int nodeIndex, int start, int end, int index, T newValue) {
            if (start == end) {
                tree.set(nodeIndex, newValue);
            } else {
                int mid = start + (end - start) / 2;
                int leftNodeIndex = nodeIndex * 2;
                int rightNodeIndex = nodeIndex * 2 + 1;

                if (index <= mid) {
                    update(leftNodeIndex, start, mid, index, newValue);
                } else {
                    update(rightNodeIndex, mid + 1, end, index, newValue);
                }

                tree.set(nodeIndex, operation.apply(tree.get(leftNodeIndex), tree.get(rightNodeIndex)));
            }
        }

        private T queryRange(int nodeIndex, int start, int end, int queryStart, int queryEnd) {
            if (queryStart > queryEnd) {
                return null;
            }
            if (queryStart == start && queryEnd == end) {
                return tree.get(nodeIndex);
            }
            int mid = start + (end - start) / 2;
            T leftResult = queryRange(nodeIndex * 2, start, mid, queryStart, Math.min(queryEnd, mid));
            T rightResult = queryRange(nodeIndex * 2 + 1, mid + 1, end, Math.max(queryStart, mid + 1), queryEnd);
            if (leftResult == null) {
                return rightResult;
            }
            if (rightResult == null) {
                return leftResult;
            }
            return operation.apply(leftResult, rightResult);
        }
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        var basketList = new ArrayList<Integer>();
        for (int basket : baskets) {
            basketList.add(basket);
        }
        var tree = new SegmentTree<>(basketList, Math::max);

        int ans = 0;
        for (int fruit : fruits) {
            if (tree.get(0, n - 1) >= fruit) {
                int index = binSearch(tree, 0, n, fruit);
                tree.update(index, 0);
            } else {
                ans++;
            }
        }

        return ans;
    }

    private int binSearch(SegmentTree<Integer> tree, int left, int right, int target) {
        if (left >= right)
            return right;
        int mid = left + (right - left) / 2;
        if (tree.get(left, mid) >= target) {
            return binSearch(tree, left, mid, target);
        } else {
            return binSearch(tree, mid + 1, right, target);
        }
    }
}