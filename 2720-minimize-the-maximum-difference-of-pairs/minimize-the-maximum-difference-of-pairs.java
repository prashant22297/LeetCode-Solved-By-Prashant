class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = nums[n - 1] - nums[0];
        while (l < r) {
            int mid = (l + r) / 2;
            if (isFeasible(nums, mid, p, n)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean isFeasible(int[] nums, int mid, int p, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) <= mid) {
                i++;
                count++;
            }
        }
        return count >= p;
    }
}