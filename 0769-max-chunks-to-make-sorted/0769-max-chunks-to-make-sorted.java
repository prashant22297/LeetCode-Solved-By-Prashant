class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans=0,value=-1;
        for(int i=0;i<arr.length;i++){
            value=Math.max(value,arr[i]);
            if(i==value){
                ans++;
            }
        }
        return ans;
    }
}