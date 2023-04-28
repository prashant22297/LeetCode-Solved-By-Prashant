class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int end = intervals[0][1],count=0;
        for(int i=1;i<intervals.length;i++){
            if(end>intervals[i][0])count++;
            else end=intervals[i][1];
        }
        return count;
    }
}