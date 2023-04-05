class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length,p=0,n=1;
        int[] ans = new int[len];
        for(int i:nums){
            if(i>0){
                ans[p]=i;
                p+=2;
            }
            else{
                ans[n]=i;
                n+=2;
            }
        }
        return ans;
    }
}