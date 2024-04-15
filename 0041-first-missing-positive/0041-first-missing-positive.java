class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        for(int i =0;i<size;i++){
            while(nums[i]>0 && nums[i]<=size && nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<size;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return size+1;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}