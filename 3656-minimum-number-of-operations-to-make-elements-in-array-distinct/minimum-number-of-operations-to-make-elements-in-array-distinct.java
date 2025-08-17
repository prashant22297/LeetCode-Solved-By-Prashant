class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (freq.containsKey(nums[i])) {
                return ((i + 1 + 2) / 3);
            }
            freq.put(nums[i], 1);
        }
        return 0;
    }
}