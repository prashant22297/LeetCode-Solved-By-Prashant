class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubset(nums, new ArrayList<>(), subsets, 0);
        System.out.println(subsets.toString());
        int ans = 0;
        for (List<Integer> sub : subsets) {
            int xor = 0;
            for (Integer a : sub) {
                xor = xor ^ a;
            }
            ans += xor;
        }
        return ans;
    }

    public void generateSubset(int[] nums, List<Integer> currentSubset, List<List<Integer>> subset, int i) {
        if (i == nums.length) {
            subset.add(new ArrayList<>(currentSubset));
            return;
        }
        generateSubset(nums, currentSubset, subset, i + 1);
        currentSubset.add(nums[i]);
        generateSubset(nums, currentSubset, subset, i + 1);
        currentSubset.remove(currentSubset.size() - 1);
    }
}