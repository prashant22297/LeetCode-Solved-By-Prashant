class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if(n==0) return ans;
        if(n==1) ans.add(Integer.toString(nums[0]));
        else {
            int s=nums[0],e=nums[0];
            for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1]+1){
                    e=nums[i];
                }
                else {
                    if(s!=e)
                        ans.add(Integer.toString(s)+"->"+Integer.toString(e));
                    else
                        ans.add(Integer.toString(s));
                    s=nums[i];
                    e=nums[i];
                }
            }
            if(s!=e) ans.add(Integer.toString(s)+"->"+Integer.toString(e));
            else ans.add(Integer.toString(s));
        }
        return ans;
    }
}