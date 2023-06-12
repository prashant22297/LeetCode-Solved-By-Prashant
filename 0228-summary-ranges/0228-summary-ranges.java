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
                    String t="";
                    if(s!=e)
                        t = Integer.toString(s)+"->"+Integer.toString(e);
                    else
                        t = Integer.toString(s);
                    ans.add(t);

                    s=nums[i];
                    e=nums[i];
                }
            }
            String t="";
            if(s!=e)
                t = Integer.toString(s)+"->"+Integer.toString(e);
            else
                t = Integer.toString(s);
            ans.add(t);
        }
        return ans;
    }
}