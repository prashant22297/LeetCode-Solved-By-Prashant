class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) hs.add(i);
        int ans=-1;
        for(int i : nums){
            if(i>0 && hs.contains((-1)*i)){
                ans=Math.max(i,ans);
            }
        }
        return ans;
    }
}