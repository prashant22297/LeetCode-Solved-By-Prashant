class Solution {
    public int maximumDifference(int[] nums) {
        // Method1 : Brute Force
        // int ans =-1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]<nums[j])
        //             ans = Math.max(ans,nums[j]-nums[i]);
        //     }
        // }
        // return ans;
// Method2: O(N) It will take care automatically for the smaller should be coming 1st then the bigger one.
        int ans =0;
        int curr=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<curr)
                curr=nums[i];
          ans = Math.max(ans,nums[i]-curr);
        }
        return ans==0?-1:ans;
    }
}