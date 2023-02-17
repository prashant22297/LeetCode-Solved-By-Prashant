class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2,pivot=-1;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        // System.out.println(i);
        if(i==-1){
            reverse(nums,i+1,nums.length-1);
            // System.out.println("YES");
        }
        else{
        int j=nums.length-1;
        while(j>i){
            if(nums[j]>nums[i]){
                break;
            }
            j--;
        }
        // System.out.println(j);
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        reverse(nums,i+1,nums.length-1);
        }
                
    }
    void reverse(int[] nums, int start ,int end ){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}