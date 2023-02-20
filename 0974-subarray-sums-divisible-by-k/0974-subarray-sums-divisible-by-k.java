class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        int prefix=0;
        int ans=0;
        freq[0]=1;
        for(int i=0;i<nums.length;i++){
            prefix =((prefix+nums[i])%k+k)%k;
            ans+=freq[prefix];
            freq[prefix]++;
        }
        return ans;
    }
}