class Solution {
    public int missingNumber(int[] nums) {
        // Method 1: Brute Force
        int n = nums.length;
        boolean[] contains = new boolean[n+1];
        for(int num : nums){
            contains[num]=true;
        }
        for(int i=0;i<n+1;i++){
            if(contains[i]==false)
                return i;
        }
        return 0;
    }
}