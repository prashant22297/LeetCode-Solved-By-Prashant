class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
    public int solve(int[] nums,int idx,int sum){
        if(idx == nums.length) return sum;
        return solve(nums,idx+1,nums[idx]^sum)+solve(nums,idx+1,sum);
    }
}