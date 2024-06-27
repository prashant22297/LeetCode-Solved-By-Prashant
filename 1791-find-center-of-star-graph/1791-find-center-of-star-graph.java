class Solution {
    public int findCenter(int[][] edges) {
        int[] arr = new int[100005];
        for(int[] edge : edges){
            arr[edge[0]]++;
            arr[edge[1]]++;
        }
        int n = edges.length;
        for(int i=0;i<100005;i++){
            if(arr[i]==n) return i;
        }
        return 0;
    }
}