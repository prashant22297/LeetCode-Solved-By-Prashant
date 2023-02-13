class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] freq = new int[100000+1];
        Arrays.fill(freq,0);
        int l=0,r=0,i=0;
        long sum=0,ans=0;
        while(r<nums.length){
            sum+=nums[r];
            // freq[nums[r]]++;
            while(freq[nums[r]]>0 || r-l+1>k){
                freq[nums[l]]--;
                sum-=nums[l];
                l++;
            }
            freq[nums[r]]++;
            
            if(r-l+1==k) ans=Math.max(ans,sum);
            r++;
        }
//         for(int i=0;i<k;i++){
//             if(freq[nums[]])
//             freq[nums[i]]++;
//         }
//         int l=0,r=k-1;
//         while(k<nums.length){
            
//         }
        return ans;
    }
}