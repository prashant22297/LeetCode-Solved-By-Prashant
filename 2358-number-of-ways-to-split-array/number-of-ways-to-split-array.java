class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefixSum = 0;
        long totalSum = 0;
        int count = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum += nums[i];
            if (prefixSum >= totalSum - prefixSum) {
                count++;
            }
        }
        return count;
    }
}