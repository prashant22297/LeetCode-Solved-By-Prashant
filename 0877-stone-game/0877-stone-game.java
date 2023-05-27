class Solution {
    public boolean stoneGame(int[] piles) {
        int alice=solve(piles,0,piles.length-1);
        int bob=0;
        for(int i:piles){
            bob+=i;
        }
        bob=bob-alice;
        if(bob>alice) return false;
        return true;
        // System.out.println(a);
        // return true;
    }
    private int solve(int[] piles,int curr, int len){
        if(curr>=len) return 0;
        int temp = solve(piles,curr+1,len-1);
        int alice = piles[curr]+temp;
        int alicee = piles[len]+temp;
        return Math.max(alice,alicee);
    }
}