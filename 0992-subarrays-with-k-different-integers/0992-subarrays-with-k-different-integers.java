class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums, int k){
        int left=0;
        int right = 0;
        int count=0;
        int len = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        while(left<=right && right<len){
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            while(freq.size()>k){
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    freq.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}