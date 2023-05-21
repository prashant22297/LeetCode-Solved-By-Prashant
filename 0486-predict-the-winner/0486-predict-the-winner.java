public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int left=0,right = nums.length-1,sum = 0;
        for (int i: nums)
            sum = sum+i;
        int p1 = solve(nums, left, right);
        int p2 = sum-p1;
        // System.out.println(p1+" "+p2);
        if (p1 >= p2) return true;
        return false;
    }
    public static int solve(int[] nums, int left, int right) {
        if (left > right) return 0;
        int choice1 = nums[left] + Math.min(solve(nums, left + 2, right), solve(nums, left + 1, right - 1));
        int choice2 = nums[right] + Math.min(solve(nums, left + 1, right - 1), solve(nums, left, right - 2));
        return Math.max(choice1, choice2);
    }
}