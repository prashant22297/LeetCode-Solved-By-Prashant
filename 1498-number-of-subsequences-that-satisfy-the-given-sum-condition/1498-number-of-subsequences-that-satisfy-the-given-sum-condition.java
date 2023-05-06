class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0 , r=n-1 ,count=0,mod=1000000007;
        int[] pow = new int[n+1];
        pow[0]=1;
        for(int i=1;i<=n;i++){
            pow[i]=2*pow[i-1]%mod;
        }
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                count=(count+pow[r-l++])%mod;
            }
        }
        return count%mod;
    }
}