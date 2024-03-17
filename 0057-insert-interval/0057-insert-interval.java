class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i=0;
        while(i<intervals.length){
            if(intervals[i][1]<newInterval[0]){
                ans.add(intervals[i]);
                i++;
            }
            else if(intervals[i][0]>newInterval[1]){
                break;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
                i++;
            }
           
        }
        ans.add(newInterval);
        for(;i<intervals.length;i++)
            ans.add(intervals[i]);
        
        return ans.toArray(new int[ans.size()][]);
    }
}