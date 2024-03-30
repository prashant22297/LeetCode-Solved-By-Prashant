class Solution {
    public long countSubarrays(int[] nums, int k) {
        int left =0;
        int right = 0;
        long count = 0;
        int currCount=0;
        
        int maxElement = Arrays.stream(nums).max().getAsInt();
        
        while(left<=right && right <nums.length){
            if(nums[right]==maxElement){
                currCount++;
                if(currCount==k){
                    count+=nums.length-right;
                    while(nums[left]!=maxElement){
                        count+=nums.length-right;
                        left++;
                    }
                    if(nums[left]==maxElement){
                        currCount--;
                        right++;
                    }
                    left++;
                }
                else
                    right++;
            }
            else right++;
        }
        return count;
    }
}