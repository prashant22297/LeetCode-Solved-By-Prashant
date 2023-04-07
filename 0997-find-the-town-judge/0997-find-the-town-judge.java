class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0) return 1;
        int[] in = new int[n+1];
        for(int i=0;i<trust.length;i++){
            in[trust[i][1]]++;
            in[trust[i][0]]--;
        }
        for(int i=0;i<=n;i++){
            if(in[i]==n-1) return i;
        }
        return -1;
    }
}