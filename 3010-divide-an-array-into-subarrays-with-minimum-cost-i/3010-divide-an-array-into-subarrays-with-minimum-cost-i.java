class Solution {
    public int minimumCost(int[] nums) {
        int min_one = Integer.MAX_VALUE;
        int min_two = Integer.MAX_VALUE;
        int fixed = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min_two) {
                min_one = min_two;
                min_two = nums[i];
            } else if (nums[i] < min_one) {
                min_one = nums[i];
            }
        }
        return fixed + min_one + min_two;
    }
}