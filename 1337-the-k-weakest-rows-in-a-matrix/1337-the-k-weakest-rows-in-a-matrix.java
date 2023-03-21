class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      PriorityQueue<Integer> pQueue = new PriorityQueue();
      Map<Integer, List<Integer>> countMap = new HashMap<>();
      for(int i = 0; i < mat.length; i++) {
        int soldierCount = 0;
        for(int j = 0; j < mat[0].length; j++) {
         if(mat[i][j] == 1) soldierCount++;
          else break;       
        }
        pQueue.offer(soldierCount);
        List<Integer> posList = countMap.getOrDefault(soldierCount, new ArrayList<>());
        posList.add(i);
        countMap.put(soldierCount, posList);
      }
      int[] result = new int[k];
      for(int i = 0; i < k; i++){
        int soldierCount = pQueue.poll();
        int index = countMap.get(soldierCount).remove(0);
        result[i] = index;
      }
      return result;
    }
}