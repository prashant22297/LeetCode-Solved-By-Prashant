class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int ans=0;
        for(int[] i: nums)
            Arrays.sort(i);
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<m;j++){
                temp=Math.max(temp,nums[j][i]);
            }
            ans+=temp;
        }
        return ans;
    }
}