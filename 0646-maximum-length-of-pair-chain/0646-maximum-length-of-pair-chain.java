class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(A,B)->A[1]-B[1]);
        int longest = 0,curr_element=Integer.MIN_VALUE;
        for(int[] pair : pairs)
        {
            if(curr_element<pair[0]){
                curr_element=pair[1];
                longest++;
            }
        }
        return longest;
    }
}