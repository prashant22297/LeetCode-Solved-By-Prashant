class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res=0, temp=0;
        for(int i=0;i<values.length;i++){
            res=Math.max(res,values[i]+temp);
            temp=Math.max(temp,values[i])-1;
        }
        return res;
    }
}