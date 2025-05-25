class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int lengthNums = nums.length;
        int[] diff = new int[lengthNums];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            diff[l] += 1;
            if (r + 1 < lengthNums) {
                diff[r + 1] -= 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < lengthNums; i++) {
            sum += diff[i];
            if (nums[i] > sum) {
                return false;
            }
        }
        return true;
    }
}
