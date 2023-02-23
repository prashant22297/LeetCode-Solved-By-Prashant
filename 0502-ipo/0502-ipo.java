class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n= profits.length;
        int[][] both = new int[n][2];
        for(int i=0; i<n;i++){
            both[i][0]=capital[i];
            both[i][1]=profits[i];
        }
        Arrays.sort(both,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        PriorityQueue<Integer> mx = new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            while(i<n && both[i][0]<=w){
                mx.add(both[i][1]);
                i++;;
            }
            if(mx.isEmpty()){
                break;
            }
            w+=mx.poll();
        }
        return w;
    }
}