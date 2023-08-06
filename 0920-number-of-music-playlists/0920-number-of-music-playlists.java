class Solution {
    final int MOD = 1_000_000_007;
    public int recur(int n,int goal,int k,int [][]storage){
        if(goal==0&&n==0)return 1;
        if(goal==0||n==0)return 0;

        if(storage[n][goal]!=-1)return storage[n][goal];
        //check if you can proceed and go to right
        int diff_song=(int)((long)recur(n-1,goal-1,k,storage)*n%MOD);
        //check if you can take the same song
        int replay_song=(int)((long)recur(n,goal-1,k,storage)*Math.max((n-k),0)%MOD);
        //simply add all possible cases and return the answer
        return storage[n][goal]=((diff_song+replay_song)%MOD);
    }
    public int numMusicPlaylists(int n, int goal, int k) {
    int storage[][]=new int[n+1][goal+1];
    for(int []arr:storage){
        Arrays.fill(arr,-1);
    }
    return recur(n,goal,k,storage);
    }
}