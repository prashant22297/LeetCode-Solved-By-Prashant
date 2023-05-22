class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        int i=k-1;
        int[] res = new int[k];
        // List<Integer> res = new ArrayList<>();
        while(k-->0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[i--]=entry.getKey();
        }
        return res;
    }
}