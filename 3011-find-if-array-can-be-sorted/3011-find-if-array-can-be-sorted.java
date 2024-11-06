class Solution {
    public boolean canSortArray(int[] nums) {
        boolean flag=true;
        int n = nums.length;
        while(flag){
            flag=false;
            for(int i=1;i<n;i++){
                int prevCount = countSetBit(nums[i - 1]);
                int currCount = countSetBit(nums[i]);
                if(prevCount==currCount && nums[i-1]>nums[i]){
                    int temp = nums[i-1];
                    nums[i-1]=nums[i];
                    nums[i]=temp;
                    flag=true;
                }
            }
        }
        int[] tempNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tempNums);

        return Arrays.equals(nums, tempNums);
    }
    public int countSetBit(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}