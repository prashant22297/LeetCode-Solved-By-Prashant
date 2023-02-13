class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        int ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0,started=0;
        while(i<events.length || !pq.isEmpty()){
            if(pq.isEmpty()){
                started=events[i][0];
            }
            while(i<events.length && started==events[i][0]){
                pq.add(events[i][1]);
                i++;
            }
            pq.poll();
            started++;
            ans++;
            while(!pq.isEmpty() && started>pq.peek()){
                pq.poll();
            }
        }
        return ans;
    }
}