class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,min=Integer.MAX_VALUE;
        while(i+k-1<nums.length){
            min = Math.min(min,nums[i+k-1]-nums[i]);
            i++;
        }
        return min;
    }
}