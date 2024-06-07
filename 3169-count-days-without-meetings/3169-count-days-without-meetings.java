class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        // System.out.println(Arrays.deepToString(meetings));
        int end = 1;
        int ans=0;
        for(int[] meet : meetings){
            ans+=Math.max(0,meet[0]-end);
            end=Math.max(end,meet[1]+1);
            if(end>days)break;
            // if(meet[0]>end){
            //     ans+=meet[0]-end;
            //     end=meet[1];
            // }
        }
        return ans+Math.max(0,days-end+1);
    }
}