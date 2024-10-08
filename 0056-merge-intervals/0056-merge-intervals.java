class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> temp = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        if(intervals.length==0 || intervals==null){
            return temp.toArray(new int[0][0]);
        }
        int start = intervals[0][0],end =intervals[0][1];
        for(int[] i : intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                temp.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        temp.add(new int[]{start,end});
        return temp.toArray(new int[0][0]);
        
    }
}