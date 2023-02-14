class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=1 && nums[i]<=n){
                temp[nums[i]-1]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i+1!=temp[i]){
                return i+1;
            }
        }
        return n+1;
    }
}