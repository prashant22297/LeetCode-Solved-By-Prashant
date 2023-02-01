class Solution {
    public int minOperations(int[] nums) {
        int count = 0,div=0,temp=0;
        // for(int i : nums){
        //     if(i>0) count++;
        // }
        for(int i=0;i<nums.length;i++){
            temp=0;
            int n=nums[i];
            while(n>0){
                if(n%2==0){
                    n/=2;
                    temp++;
                    if(temp>div){
                        count++;
                        div=temp;
                    }
                }
                else{
                    n--;
                    count++;
                }
                
            }
          
        }
        // int t =0;
        // while(div>0){
        //     t++;
        //     div/=2;
        // }
        return count;
    }
}