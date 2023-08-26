class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> number = new HashSet<>();
        for(int i : nums){
            number.add(i);
        }
        int longest=1;
        for(int i : nums){
            if(!number.contains(i-1)){
                int curr_longest=0;
                int curr_number=i;
                while(number.contains(curr_number)){
                    curr_longest++;
                    curr_number++;
                }
                if(curr_longest>longest){
                    longest=curr_longest;
                }
            }
        }
        return longest;
    }
}