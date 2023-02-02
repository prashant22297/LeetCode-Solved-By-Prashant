class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int count_div=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%p==0){
                count_div++;
                }
                temp.add(nums[j]); 
                // System.out.print(temp);
                if(count_div<=k){
                    ans.add(new ArrayList(temp));
                }
            }
        }
        // System.out.println(ans);
        return ans.size();
    }
}