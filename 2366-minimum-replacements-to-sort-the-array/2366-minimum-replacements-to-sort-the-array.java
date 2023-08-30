class Solution {
    public long minimumReplacement(int[] nums) {
        long count=0;
        int prev=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>prev){
                int div = nums[i]/prev;
                if(nums[i]%prev!=0){
                    div++;
                    prev=nums[i]/div;
                }
                count+=div-1;
            }
            else prev = nums[i];
        }
        return count;
    }
}