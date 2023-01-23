class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0) return 1;
        int[] judge = new int[n+1];
        for(int[] e : trust){
            judge[e[0]]--;
            judge[e[1]]++;
        }
        for(int i=0;i<n+1;i++){
            if(judge[i] == n-1) return i;
        }
        return -1;
    }
}