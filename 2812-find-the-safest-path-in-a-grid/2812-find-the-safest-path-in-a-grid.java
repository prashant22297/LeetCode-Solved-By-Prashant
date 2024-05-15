class Solution {
    int[] row = {0, 0, -1, 1};
    int[] col = {-1, 1, 0, 0};
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dis = new int[n][n];
        for (int[] i : dis) 
            Arrays.fill(i, Integer.MAX_VALUE);
        fillDistance(grid, dis, n);
        // System.out.println(Arrays.deepToString(dis));
        int l =0;
        int h = 400;
        int ans=0;
        while(l<=h){
            int mid = (l+h)/2;
            if(solve(dis,n,mid)){
                l=mid+1;
                ans=mid;
            }
            else {
                h=mid-1;
            }
        }
        return ans;
    }
    public boolean solve(int[][] dis, int n, int mid){
        if(dis[0][0]<mid)return false;
        Queue<int[]> q= new LinkedList<>();
        boolean[][] vis= new boolean[n][n];
        q.offer(new int[]{0,0});
        vis[0][0]=true;
        while(!q.isEmpty()){
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
            if(x==n-1 && y==n-1) return true;
            for(int i=0;i<4;i++){
                int newX = x+row[i];
                int newY = y+col[i];
                if(newX<n && newX>=0 && newY<n && newY>=0 && dis[newX][newY]>=mid && !vis[newX][newY]){
                    q.offer(new int[]{newX,newY});
                    vis[newX][newY]=true;
                }
            }
        }
        return false;
    }
    public void fillDistance(List<List<Integer>> grid, int[][] dis, int n ){
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    dis[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
            int d = dis[x][y];
            for(int i=0;i<4;i++){
                int newX = x+row[i];
                int newY = y+col[i];
                if(newX<n && newX>=0 && newY<n && newY>=0 && dis[newX][newY]>d+1){
                    q.offer(new int[]{newX,newY});
                    dis[newX][newY]=d+1;
                }
            }
        }
    }
}