class Solution {
    int ans;
    public int maximumRequests(int n, int[][] requests) {
        ans=0;
        int[] building = new int[n];
        Arrays.fill(building,0);
        int numberOfReq = requests.length;
        solve(0,numberOfReq,requests,0,building);
        return ans;
    }
    private void solve(int idx, int numberOfReq, int[][] requests, int count,int[] building){
        if(idx>=numberOfReq){
            for(int i: building){
                if(i!=0) return;
            }
            ans = Math.max(ans,count);
            return;
        }
        count++;
        int from = requests[idx][0];
        int to = requests[idx][1];
        building[from]--;
        building[to]++;
        solve(idx+1,numberOfReq,requests,count, building);
        count--;
        building[from]++;
        building[to]--;
        solve(idx+1,numberOfReq,requests,count, building);
    }
}