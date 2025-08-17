class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans =0;
        int min = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-min<=k){
                continue;
            }else{
                ans++;
                min = nums[i];
            }
        }
        return ans+1;
    }
}