class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min =10001,max = -1;
        for(int i: nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        return (max-k-(min+k))<0?0:max-k-(min+k);
    }
}