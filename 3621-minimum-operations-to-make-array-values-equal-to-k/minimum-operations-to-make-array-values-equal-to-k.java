class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            numsSet.add(num);
        }
        int[] uniqueNums = numsSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(uniqueNums);
        if (uniqueNums[0] < k) {
            return -1;
        }
        for (int i = uniqueNums.length - 1; i >= 0; i--) {
            if (uniqueNums[i] > k) {
                count++;
            }
        }
        return count;

    }
}