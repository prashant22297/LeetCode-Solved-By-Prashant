class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] presum = new int[n];
        int[] postsum = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            presum[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            postsum[i]=sum;
        }
        for(int i=0;i<n;i++){
            if(presum[i]==postsum[i])
                return i;
        }
        return -1;
    }
}