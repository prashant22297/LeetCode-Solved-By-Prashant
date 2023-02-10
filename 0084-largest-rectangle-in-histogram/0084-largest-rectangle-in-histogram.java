class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0]=-1;
        right[n-1]=n;
        for(int i=1;i<n;i++){
            int idx = i-1;
            while(idx>=0 && heights[idx]>=heights[i]){
                idx=left[idx];
            }
            left[i]=idx;
        }
        for(int i=n-2;i>=0;i--){
            int idx = i+1;
            while(idx<=n-1 && heights[idx]>=heights[i]){
                idx=right[idx];
            }
            right[i]=idx;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,(right[i]-left[i]-1)*heights[i]);
        }
        // System.out.println(Arrays.toString(right));
        
        return ans;
    }
}