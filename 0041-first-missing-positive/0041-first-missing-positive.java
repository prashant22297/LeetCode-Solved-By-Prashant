class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int temp;
        for(int i=0;i<n;i++){
            temp=nums[i];
            if(nums[i]>=1 && nums[i]<=n && nums[temp-1]!=temp){
                int t = nums[temp-1];
                nums[temp-1]=temp;
                nums[i]=t;
                i--;
            }
        }
        for(int i=0;i<n;i++){
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return n+1;
    }
}