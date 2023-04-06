class Solution {
    public int minOperations(int[] nums) {
        int mul=0,count=0;
        for(int i=0;i<nums.length;i++){
            int temp_count=0;
            while(nums[i]>0){
                if(nums[i]%2==0){
                    nums[i]/=2;
                    temp_count++;
                    if(temp_count>mul){
                        count++;
                        mul=temp_count;
                    }
                }
                else {
                    nums[i]--;
                    count++;
                }
            }
        }
        return count;
    }
}