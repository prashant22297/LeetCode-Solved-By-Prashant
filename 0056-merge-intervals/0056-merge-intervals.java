class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        if(intervals.length==0 || intervals==null){
            return ans.toArray(new int[0][0]);
        }
        int start=intervals[0][0], end = intervals[0][1];
        for(int[] e : intervals){
            if(e[0]<=end){
                end=Math.max(end,e[1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=e[0];
                end=e[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][0]);
    }
}