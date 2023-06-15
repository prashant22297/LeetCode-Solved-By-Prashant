class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        else {
            int s=0,e=nums.length-1;
            int leftSmall= Integer.MAX_VALUE,rightGreater=Integer.MIN_VALUE;
            int small= Integer.MAX_VALUE,big=Integer.MIN_VALUE;
            while(s<n-1 && nums[s]<=nums[s+1]){
                if(nums[s]<leftSmall)
                    leftSmall=nums[s];
                s++;
               
            }
            while(e>0 && nums[e]>=nums[e-1]){
                if(nums[s]>rightGreater)
                    rightGreater=nums[e];
                e--;
            }
            // System.out.println(leftSmall+" "+rightGreater);
            // System.out.println(s+" "+e);
            if(s>e) return 0;
            else {
                for(int i=s;i<=e;i++){
                    if(nums[i]<small){
                        small =nums[i];
                    }
                    if(nums[i]>big){
                        big=nums[i];
                    }
                }
                int id1=0,id2=0;
                for(int i = 0; i < n; i++){
                    if(nums[i] > small){   
                        id1 = i;
                        break;
                    }
                }
                for(int i = 0; i < n; i++){
                    if(nums[i] < big){
                        id2 = i;
                    }
                }
                // System.out.println(small+" "+big);
                return id2-id1+1;
            }
        }
    }
}