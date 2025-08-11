class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] res = new int[n / 3][3];
        int resCounter = 0;
        int i = 0;
        while (i < n - 2) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }
            int[] temp = new int[3];
            for (int j = 0; j <= 2; j++) {
                temp[j] = nums[i];
                i++;
            }
            res[resCounter++] = temp;
        }
        return res;
    }
}