class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] pos = new int[len/2];
        int[] neg = new int[len/2];
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                neg[a++]=nums[i];
            }
            else pos[b++]=nums[i];
        }
        a=0;
        b=0;
        for(int i=0;i<len;i+=2){
            nums[i]=pos[b++];
            nums[i+1]=neg[a++];
        }
        return nums;
    }
}