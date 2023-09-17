class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        if(n==1 || n==0) return 0;
        int allVisited = (1<<n)-1;
        Queue<int[]> q = new LinkedList<>();
        Set<Pair<Integer, Integer>> vis = new HashSet<>();
        for(int i = 0;i<n;i++){
            int mask = (1<<i);
            q.add(new int[]{i,mask});
            vis.add(new Pair<>(i,mask));
        }
        int distance = 0;
        while(!q.isEmpty()){
            int N = q.size();
            distance++;
            for(int i=0;i<N;i++){
                int[] curr = q.poll();
                int currNode = curr[0];
                int currMask = curr[1];
                
                for(int next: graph[currNode]){
                    int nextMask = (currMask | (1<<next));
                    if(allVisited == nextMask) return distance;
                    Pair<Integer,Integer> p = new Pair<>(next,nextMask);
                    if(!vis.contains(p)){
                        vis.add(new Pair<>(next,nextMask));
                        q.add(new int[]{next,nextMask});
                    }
                }
            }
        }
        return -1;
    }
}