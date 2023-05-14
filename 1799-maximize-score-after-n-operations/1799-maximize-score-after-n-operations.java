class Solution {

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    private int solve(int[] nums, ArrayList<Boolean> visited, int operation, Map<ArrayList<Boolean>, Integer> memo) {

        if (memo.containsKey(visited)) return memo.get(visited);
        int maxScore = 0;
        
        for (int i = 0; i<=nums.length-2; i++) {
            if (visited.get(i)) continue;
            for (int j = i+1; j < nums.length; j++) {
               if (visited.get(j)) continue;
               visited.set(i, true);
               visited.set(j, true);
            
               int score = operation * gcd(nums[i], nums[j]);
               int rScore = solve(nums, visited, operation+1, memo);

              visited.set(i, false);
              visited.set(j, false);
               
               maxScore = Math.max(maxScore, (score + rScore));
            }
        }

        memo.put(new ArrayList<>(visited), maxScore);
        return maxScore;
    }

    public int maxScore(int[] nums) {
        ArrayList<Boolean> visited = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) visited.add(false);
        Map<ArrayList<Boolean>, Integer> memo = new HashMap<>();

        return solve(nums, visited, 1, memo);
    }
}