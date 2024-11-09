class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i : nums){
            pq.add(i);

        }
        long score = 0;
        while(k-->0){
            int maxEle = pq.poll();
            score+=maxEle;
            pq.add((int) Math.ceil(maxEle/3.0));
        }
        return score;
    }
}