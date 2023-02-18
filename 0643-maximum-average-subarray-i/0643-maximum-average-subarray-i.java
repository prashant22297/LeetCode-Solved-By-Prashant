class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        double sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k-1){
                avg = Math.max(avg,sum/k);
                sum=sum-nums[j];
                j++;
            }
            
        }
        return avg;
    }
}