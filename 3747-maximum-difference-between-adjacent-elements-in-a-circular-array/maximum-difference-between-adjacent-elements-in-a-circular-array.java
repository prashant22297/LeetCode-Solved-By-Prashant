class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int absDiff = 0;
        for (int i = 0; i < n + 2; i++) {
            int a = nums[i % n];
            int b = nums[(i + 1) % n];
            absDiff = Math.max(absDiff, Math.abs(a - b));
        }
        return absDiff;
    }
}