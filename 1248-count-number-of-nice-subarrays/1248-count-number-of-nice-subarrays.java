class Solution {
     public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = (nums[i] % 2 == 0) ? 0 : 1;
        }
        return numberOfSubarraysUtil(nums, k) - numberOfSubarraysUtil(nums, k - 1);
    }
    private int numberOfSubarraysUtil(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int left = 0;
        int count = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; ++right) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
   
}