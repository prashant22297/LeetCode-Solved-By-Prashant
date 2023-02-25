class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefix = new HashMap<>();
        int currSum=0,count=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(prefix.containsKey(currSum-k)){
                count+=prefix.get(currSum-k);
            }
            if(currSum==k)
                count++;
            prefix.put(currSum,prefix.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}