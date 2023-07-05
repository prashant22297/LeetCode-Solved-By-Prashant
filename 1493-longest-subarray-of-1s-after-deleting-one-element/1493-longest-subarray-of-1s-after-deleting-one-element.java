class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length,i=0,count=0,ans=0;
        boolean zero=false;
        while(i<len){
            int j=i;
            for(;j<len;j++){
                if(nums[j]==1) count++;
                else{
                    if(zero==false){
                        i=j+1;
                        zero=true;
                    }
                    else if(zero==true){
                        
                        count=0;
                        zero=false;
                        break;
                    }
                    
                    // break;
                }
                ans=Math.max(ans,count);
            }
            if(j==len) break;
        }
        return ans==len?ans-1:ans;
    }
}