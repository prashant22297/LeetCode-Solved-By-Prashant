import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // HashMap to store the first occurrence of each prefix sum modulo result
        HashMap<Integer, Integer> prefixSumModMap = new HashMap<>();
        // Initialize with 0 to handle cases where the subarray starts from index 0
        prefixSumModMap.put(0, -1);
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int modValue = prefixSum % k;
            
            // Handle negative modulo values
            if (modValue < 0) {
                modValue += k;
            }
            
            if (prefixSumModMap.containsKey(modValue)) {
                if (i - prefixSumModMap.get(modValue) >= 2) {
                    return true;
                }
            } else {
                prefixSumModMap.put(modValue, i);
            }
        }
        
        return false;
    }
}
