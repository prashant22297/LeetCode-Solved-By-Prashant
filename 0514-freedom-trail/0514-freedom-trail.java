class Solution {

    public int findRotateSteps(String ring, String key) {
        int[][] dp = new int[ring.length() + 1][key.length() + 1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(0, 0, ring, key, dp);
    }

    private int solve(int ringIndex, int keyIndex, String ring, String key, int[][] dp) {
        if (keyIndex == key.length()) return 0;

        if (dp[ringIndex][keyIndex] != -1) return dp[ringIndex][keyIndex];
        int index = 0;
        int ans = Integer.MAX_VALUE;
        int temp = ringIndex;
        // Clockwise rotate
        while (index < ring.length()) {
            if (ring.charAt(temp) == key.charAt(keyIndex)) {
                ans = Math.min(ans, 1 + index + solve(temp, keyIndex + 1, ring, key, dp));
            }
            index++;
            temp++;
            temp = temp % ring.length();
        }

        index = 0;
        temp = ringIndex;
        // Anti
        while (index < ring.length()) {
            if (ring.charAt(temp) == key.charAt(keyIndex)) {
                ans = Math.min(ans, 1 + index + solve(temp, keyIndex + 1, ring, key, dp));
            }
            index++;
            temp--;
            temp = temp + ring.length();
            temp = temp % ring.length();
        }
        return dp[ringIndex][keyIndex] = ans;
    }
}
