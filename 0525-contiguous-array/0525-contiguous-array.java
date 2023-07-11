class Solution {
    public int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == 0) nums[i] = -1;
        
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                max = Math.max(max, i - idx);
            }
            else{
                map.put(sum, i);
            }
        }
        return max;
    }
}