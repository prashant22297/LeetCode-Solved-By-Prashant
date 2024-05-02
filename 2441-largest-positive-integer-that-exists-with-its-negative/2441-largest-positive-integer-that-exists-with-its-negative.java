class Solution {

    public int findMaxK(int[] nums) {
        int ans = -1;
        boolean[] temp = new boolean[2001];
        Arrays.fill(temp, false);
        for (int i : nums) {
            int t = (-1 * i) + 1000;
            if (temp[t] == true) ans = Math.max(ans, Math.abs(i)); else temp[i + 1000] = true;
        }
        return ans;
    }
}
