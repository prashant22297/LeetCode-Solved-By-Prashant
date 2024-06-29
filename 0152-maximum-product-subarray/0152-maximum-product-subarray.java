class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        double maxPro = Integer.MIN_VALUE;
        double pre = 1;
        double suf = 1;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre = pre*(double)nums[i];
            suf = suf*(double)nums[n-i-1];
            maxPro= Math.max(maxPro,Math.max(pre,suf));
        }
        return (int)maxPro;
    }
}