class Solution {
    public int trap(int[] height) {
        // Method 1 : Using two array :
        // Left highest value and right highest value
        int n = height.length;
        int[] leftHighestValue = new int[n];
        int[] rightHighestValue = new int[n];
        leftHighestValue[0] = -1;
        for (int i = 1; i < n; i++) {
            leftHighestValue[i] = Math.max(height[i - 1], leftHighestValue[i - 1]);
        }
        rightHighestValue[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            rightHighestValue[i] = Math.max(height[i + 1], rightHighestValue[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = (Math.min(leftHighestValue[i], rightHighestValue[i]) - height[i]);
            if (temp > 0)
                ans += (Math.min(leftHighestValue[i], rightHighestValue[i]) - height[i]);
        }
        return ans;
    }
}