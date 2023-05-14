class Solution {
    public int maxScore(int[] nums) {
        int n = nums.length;
        ArrayList<Boolean> visited = new ArrayList<>(nums.length);
        for(int i=0;i<n;i++)
            visited.add(false);
        Map<ArrayList<Boolean>, Integer> dp = new HashMap<>();
        int[][] g = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j =0; j<n;j++){
                g[i][j]=gcd(nums[i],nums[j]);
            }
        }
        return solve(nums,1,n,g,visited,dp);
    }
    public int solve(int[] nums, int op,int n, int[][] g,ArrayList<Boolean> visited,Map<ArrayList<Boolean>, Integer> dp){
        // if(op == n) return 0;
        if(dp.containsKey(visited)) return dp.get(visited);
        int res=0;
        for(int i=0;i<n;i++){
            if(visited.get(i)==false){
                for(int j =i+1; j<n;j++){
                    if(visited.get(j)==false){
                        visited.set(i,true);
                        visited.set(j,true);
                    
                        res=Math.max(res, (op)*g[i][j]+solve(nums,op+1,n,g,visited,dp));
                        visited.set(i,false);
                        visited.set(j,false);
                    }
                }
            }
        }
        dp.put(new ArrayList<>(visited),res);
        return res;
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}