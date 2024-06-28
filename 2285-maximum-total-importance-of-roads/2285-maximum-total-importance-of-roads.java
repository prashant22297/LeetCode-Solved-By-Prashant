class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] freq = new long[n];
        for(int[] road: roads){
            freq[road[0]]++;
            freq[road[1]]++;
        }
        Arrays.sort(freq);
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=(i+1)*freq[i];
        }
        return sum;
    }
}