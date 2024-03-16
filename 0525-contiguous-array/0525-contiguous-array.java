class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> firstOcc =new HashMap<>();
        int preSum = 0;
        int maxLength=0;
        int arrLen= nums.length;
        firstOcc.put(0,-1);
        for(int i=0;i<arrLen;i++){
            preSum+=nums[i]==0?-1:1;
            if(firstOcc.containsKey(preSum)){
                maxLength=Math.max(maxLength,i-firstOcc.get(preSum));
            }
            else firstOcc.put(preSum,i);
        }
        return maxLength;
    }
}