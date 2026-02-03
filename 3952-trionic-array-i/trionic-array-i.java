class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        if (n < 4) return false;

        int i = 0;

        // 1️⃣ First Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must have at least one increase
        if (i == 0) return false;

        int p = i;

        // 2️⃣ Decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // Must have at least one decrease
        if (i == p) return false;

        int q = i;

        // 3️⃣ Second Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must consume entire array
        return i == n - 1 && q < n - 1;
    }
}
