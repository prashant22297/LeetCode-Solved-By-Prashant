class Solution {
    public int maxChunksToSorted(int[] arr) {
        int idx=0,maxleft= -1,ans=0;
        int[] minright = new int[arr.length+1];
        minright[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            minright[i] = Math.min(minright[i+1],arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            maxleft = Math.max(maxleft,arr[i]);
            if(maxleft<=minright[i+1])
                ans++;
            
        }
        return ans;
    }
}