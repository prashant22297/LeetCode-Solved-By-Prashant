class Solution {
    public int dominantIndex(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        if(temp[temp.length-1]>=temp[temp.length-2]*2){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==temp[temp.length-1]){
                    return i;
                }
            }
        }
        return -1;
    }
}