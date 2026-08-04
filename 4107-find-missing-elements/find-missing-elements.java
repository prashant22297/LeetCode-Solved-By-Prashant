class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = n < min ? n : min;
            max = n > max ? n : max;
        }
        List<Integer> missingNumber = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            boolean numberFound = false;
            for (int n : nums) {
                if (i == n) {
                    numberFound = true;
                    break;
                }
            }
            if (!numberFound) {
                missingNumber.add(i);
            }
        }
        return missingNumber;
    }
}